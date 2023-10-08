package com.elbertribeiro.usuario;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;

public class UsuarioDto {
    @Schema(description = "Nome do usuario", example = "Jon Robertson")
    @NotBlank(message = "{usuario.nome.campo.obrigatorio}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
