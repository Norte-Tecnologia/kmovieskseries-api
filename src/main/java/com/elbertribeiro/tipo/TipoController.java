package com.elbertribeiro.tipo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("tipos")
public class TipoController {
    private final TipoService tipoService;

    public TipoController(TipoService tipoService) {
        this.tipoService = tipoService;
    }

    @GetMapping
    public ResponseEntity<List<TipoDto>> listarTipos() {
        return ok(tipoService.buscaTipos());
    }
}
