package com.elbertribeiro.plataforma;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping(value = "plataformas", produces = "application/json")
public class PlataformaController {

    private final PlataformaService plataformaService;


    public PlataformaController(PlataformaService plataformaService) {
        this.plataformaService = plataformaService;
    }

    @GetMapping
    public ResponseEntity<List<PlataformaDto>> listarPlataformas() {
        return ok(plataformaService.buscaPlataformas());
    }
}
