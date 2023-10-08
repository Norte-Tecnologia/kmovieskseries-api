package com.elbertribeiro.kmovieskseries.usuario;

import jakarta.validation.constraints.NotBlank;

public class UsuarioDto {
    @NotBlank(message = "{usuario.nome.campo.obrigatorio}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
