package com.elbertribeiro.serie;

import com.elbertribeiro.plataformas.PlataformasEntity;
import com.elbertribeiro.plataformas.PlataformasService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {
    private final SerieRepository serieRepository;

    private final PlataformasService plataformasService;

    public SerieService(SerieRepository serieRepository, PlataformasService plataformasService) {
        this.serieRepository = serieRepository;
        this.plataformasService = plataformasService;
    }

    public SerieEntity buscaSerie(String titulo){
        return Optional.ofNullable(serieRepository
                .findAllByTitulo(titulo))
                .orElseThrow(() -> new RuntimeException("Série não encontrada"));
    }

    public SerieEntity salvarSerie(SerieEntity serieEntity) {
        PlataformasEntity plataformasEntity = plataformasService
                .listarPlataformasByNome(serieEntity.getPlataforma().getName());
        serieEntity.setPlataforma(plataformasEntity);
        return serieRepository.save(serieEntity);
    }

    public String atualizarAssistido(Boolean assistido, String titulo) {
        SerieEntity serieEntity = this.buscaSerie(titulo);
        serieEntity.setAssistido(assistido);
        serieRepository.save(serieEntity);
        return "Status da obra alterado";
    }

    public List<SerieEntity> listarSeries() {
        return serieRepository.findAll();
    }
}
