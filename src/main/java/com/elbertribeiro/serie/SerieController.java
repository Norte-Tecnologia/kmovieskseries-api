package com.elbertribeiro.serie;

import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "series", produces = "application/json")
public class SerieController {
    private final SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping
    public ResponseEntity<List<SerieDto>> listarSeries() {
        return ok(serieService
                .listarSeries()
                .stream()
                .map(SerieConvert::serieToDto)
                .toList());
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

    @PutMapping(value = "/{assistido}/{titulo}")
    public String criarSerie(@PathVariable @NotNull Boolean assistido,
                             @PathVariable @NotNull String titulo) {
        return serieService.atualizarAssistido(assistido, titulo);
    }
}
