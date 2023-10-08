package com.elbertribeiro.plataformas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plataformas")
public class PlataformasController {
    private final PlataformasService plataformasService;

    public PlataformasController(PlataformasService plataformasService) {
        this.plataformasService = plataformasService;
    }

    @GetMapping
    public List<PlataformasDto> listarPlataformas() {
        return plataformasService
                .listarPlataformas()
                .stream()
                .map(PlataformasConvert::plataformaToDto)
                .toList();
    }

    @PostMapping
    public Plataformas criarPlataforma(@RequestBody PlataformasDto plataformasDto) {
        return plataformasService.salvarPlataforma(
                Optional
                        .ofNullable(plataformasDto)
                        .map(PlataformasConvert::plataformaToEntity)
                        .orElseThrow(() -> new RuntimeException("Erro ao criar plataforma"))
        );
    }
}
