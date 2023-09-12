package com.elbertribeiro.kmovieskseries.serie;

import com.elbertribeiro.kmovieskseries.plataformas.PlataformasEntity;
import com.elbertribeiro.kmovieskseries.plataformas.PlataformasService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {
    private final SerieRepository serieRepository;

    private final PlataformasService plataformasService;

    public SerieService(SerieRepository serieRepository, PlataformasService plataformasService) {
        this.serieRepository = serieRepository;
        this.plataformasService = plataformasService;
    }

    public SerieEntity salvarSerie(SerieEntity serieEntity) {
        PlataformasEntity plataformasEntity = plataformasService
                .listarPlataformasByNome(serieEntity.getPlataforma().getName());
        serieEntity.setPlataforma(plataformasEntity);
        return serieRepository.save(serieEntity);
    }

    public String atualizarAssistido(Boolean assistido, String titulo) {
        SerieEntity serieEntity = serieRepository.findAllByTitulo(titulo);
        if(serieEntity == null) throw new RuntimeException("Série não encontrada");
        serieEntity.setAssistido(assistido);
        serieRepository.save(serieEntity);
        return "Status da obra alterado";
    }

    public List<SerieEntity> listarSeries() {
        return serieRepository.findAll();
    }
}
