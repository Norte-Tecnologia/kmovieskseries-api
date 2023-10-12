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

    private final SerieConvert serieConvert;

    public SerieController(SerieService serieService, SerieConvert serieConvert) {
        this.serieService = serieService;
        this.serieConvert = serieConvert;
    }

    @GetMapping
    public ResponseEntity<List<SerieDto>> listarSeries() {
        return ok(serieService
                .listarSeries()
                .stream()
                .map(serieConvert::serieToDto)
                .toList());
    }

    @PostMapping
    public ResponseEntity<SerieDto> criarSerie(@RequestBody NovaSerieDto novaSerieDto) {
        return status(HttpStatus.CREATED)
                .body(Optional.ofNullable(serieService.salvarSerie(
                                Optional
                                        .ofNullable(novaSerieDto)
                                        .map(serieConvert::serieToEntity)
                                        .orElseThrow(() -> new RuntimeException("n deu bom"))
                        ))
                        .map(serieConvert::serieToDto)
                        .orElseThrow(() -> new ValidacaoExcecao("Não foi possivel exibir Serie criada")));
    }

    @PutMapping(value = "/{assistido}/{titulo}/{tipo}")
    public String atualizarSerie(@PathVariable @NotNull Boolean assistido,
                                 @PathVariable @NotNull String titulo,
                                 @PathVariable @NotNull String tipo) {
        return serieService.atualizarAssistido(assistido, titulo, tipo);
    }

    @DeleteMapping(value = "/{titulo}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletarSerie(@PathVariable @NotNull String titulo,
                             @PathVariable @NotNull String tipo) {
        serieService.deletarSerie(titulo, tipo);
    }
}
