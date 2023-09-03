package com.elbertribeiro.kmovieskseries.serie;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("series")
public class SerieController {
    private final SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping
    public List<SerieDto> listarSeries() {
        return serieService
                .listarSeries()
                .stream()
                .map(SerieConvert::serieToDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public Serie criarSerie(@RequestBody SerieDto serieDto) {
        return serieService.salvarSerie(
                Optional
                        .ofNullable(serieDto)
                        .map(SerieConvert::serieToEntity)
                        .orElseThrow(() -> new RuntimeException("n deu bom"))
        );
    }
}
