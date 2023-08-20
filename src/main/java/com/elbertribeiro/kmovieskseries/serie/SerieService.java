package com.elbertribeiro.kmovieskseries.serie;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {
    private final SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public Serie salvarSerie(Serie serie) {
        return serieRepository.save(serie);
    }

    public List<Serie> listarSeries() {
        return serieRepository.findAll();
    }
}
