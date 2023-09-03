package com.elbertribeiro.kmovieskseries.usuario;

public record UsuarioDto(
        String name
) implements Usuario{
    @Override
    public String getName() {
        return this.name;
    }
}
