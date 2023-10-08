package com.elbertribeiro.kmovieskseries.usuario;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class UsuarioDto {
    @NotNull
    @NotEmpty(message = "não pode ser vazio")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
