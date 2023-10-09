package com.elbertribeiro.serie;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {
    private final SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public Serie buscaSerie(String titulo){
        return Optional.ofNullable(serieRepository
                .findAllByTitulo(titulo))
                .orElseThrow(() -> new RuntimeException("Série não encontrada"));
    }

    public Serie salvarSerie(Serie serie) {
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
