package com.elbertribeiro.tipos;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("tipos")
public class TiposController {
    private final TiposService tiposService;

    public TiposController(TiposService tiposService) {
        this.tiposService = tiposService;
    }

    @GetMapping
    public List<TiposDto> listarPlataformas() {
        return tiposService
                .listarTipos()
                .stream()
                .map(TiposConvert::tipoToDto)
                .toList();
    }

    @PostMapping
    public Tipos criarPlataforma(@RequestBody TiposDto tiposDto) {
        return tiposService.salvarTipo(
                Optional
                        .ofNullable(tiposDto)
                        .map(TiposConvert::tipoToEntity)
                        .orElseThrow(() -> new RuntimeException("Erro ao criar tipo"))
        );
    }
}
