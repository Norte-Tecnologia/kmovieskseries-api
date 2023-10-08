package com.elbertribeiro.serie;

import com.elbertribeiro.plataformas.Plataformas;
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

    public Serie buscaSerie(String titulo){
        return Optional.ofNullable(serieRepository
                .findAllByTitulo(titulo))
                .orElseThrow(() -> new RuntimeException("Série não encontrada"));
    }

    public Serie salvarSerie(Serie serie) {
        Plataformas plataformas = plataformasService
                .listarPlataformasByNome(serie.getPlataforma());
        serie.setPlataforma(plataformas.getName());
        return serieRepository.save(serie);
    }

    public String atualizarAssistido(Boolean assistido, String titulo) {
        Serie serie = this.buscaSerie(titulo);
        serie.setAssistido(assistido);
        serieRepository.save(serie);
        return "Status da obra alterado";
    }

    public List<Serie> listarSeries() {
        return serieRepository.findAll();
    }
}
