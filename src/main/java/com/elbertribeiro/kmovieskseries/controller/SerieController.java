package com.elbertribeiro.kmovieskseries.controller;

import com.elbertribeiro.kmovieskseries.model.entity.Serie;
import com.elbertribeiro.kmovieskseries.service.SerieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("series")
public class SerieController {
    private final SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping
    public List<Serie> listarSeries() {
        return serieService.listarSeries();
    }

    @PostMapping
    public Serie criarSerie(@RequestBody Serie serie) {
        return serieService.salvarSerie(serie);
    }
}
