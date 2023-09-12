package com.elbertribeiro.kmovieskseries.serie;

import jakarta.validation.constraints.NotNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
                .toList();
    }

    @PostMapping
    public SerieEntity criarSerie(@RequestBody SerieDto serieDto) {
        return serieService.salvarSerie(
                Optional
                        .ofNullable(serieDto)
                        .map(SerieConvert::serieToEntity)
                        .orElseThrow(() -> new RuntimeException("n deu bom"))
        );
    }

    @PutMapping(value = "/{assistido}/{titulo}")
    public String criarSerie(@PathVariable @NotNull Boolean assistido,
                             @PathVariable @NotNull String titulo) {
        return serieService.atualizarAssistido(assistido, titulo);
    }
}
