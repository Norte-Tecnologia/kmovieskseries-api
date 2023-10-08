package com.elbertribeiro.plataformas;

import com.elbertribeiro.excecao.ValidacaoExcecao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

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
    public ResponseEntity<PlataformasDto> criarPlataforma(@RequestBody PlataformasDto plataformasDto) {
        return status(HttpStatus.CREATED)
                .body(Optional
                        .ofNullable(plataformasService.salvarPlataforma(
                                Optional
                                        .ofNullable(plataformasDto)
                                        .map(PlataformasConvert::plataformaToEntity)
                                        .orElseThrow(() -> new ValidacaoExcecao("Erro ao criar plataforma"))
                        ))
                        .map(PlataformasConvert::plataformaToDto)
                        .orElseThrow(() -> new ValidacaoExcecao("Erro ao exibir Plataforma criada")));
    }
}
