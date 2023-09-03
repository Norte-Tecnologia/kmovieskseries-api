package com.elbertribeiro.kmovieskseries.usuario;

public record UsuarioDto(
        String nomeUsuario
) implements Usuario{
    @Override
    public String getName() {
        return this.nomeUsuario;
    }
}
