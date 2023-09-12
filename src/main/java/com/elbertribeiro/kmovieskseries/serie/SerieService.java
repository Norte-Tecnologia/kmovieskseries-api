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

    public Serie salvarSerie(Serie serie) {
        PlataformasEntity plataformasEntity = plataformasService.listarPlataformasByNome(serie.getPlataforma());
        if(plataformasEntity == null) throw new RuntimeException("Plataforma não encontrada");
        serie.setUrlLogo(plataformasEntity.getUrlLogo());
        return serieRepository.save(serie);
    }

    public String atualizarAssistido(Boolean assistido, String titulo) {
        Serie serie = serieRepository.findAllByTitulo(titulo);
        if(serie == null) throw new RuntimeException("Série não encontrada");
        serie.setAssistido(assistido);
        serieRepository.save(serie);
        return "Status da obra alterado";
    }

    public List<Serie> listarSeries() {
        return serieRepository.findAll();
    }
}
