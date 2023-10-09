package com.elbertribeiro.serie;

import com.elbertribeiro.excecao.ValidacaoExcecao;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.http.ResponseEntity.status;

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
    public ResponseEntity<SerieDto> criarSerie(@RequestBody NovaSerieDto novaSerieDto) {
        return status(HttpStatus.CREATED)
                .body(Optional.ofNullable(serieService.salvarSerie(
                Optional
                        .ofNullable(novaSerieDto)
                        .map(SerieConvert::serieToEntity)
                        .orElseThrow(() -> new RuntimeException("n deu bom"))
        ))
                .map(SerieConvert::serieToDto)
                .orElseThrow(() -> new ValidacaoExcecao("Não foi possivel exibir Serie criada")));
    }

    @PutMapping(value = "/{assistido}/{titulo}")
    public String criarSerie(@PathVariable @NotNull Boolean assistido,
                             @PathVariable @NotNull String titulo) {
        return serieService.atualizarAssistido(assistido, titulo);
    }
}
