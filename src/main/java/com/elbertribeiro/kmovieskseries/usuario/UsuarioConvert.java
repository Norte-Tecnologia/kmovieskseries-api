package com.elbertribeiro.kmovieskseries.usuario;

public class UsuarioConvert {
    private UsuarioConvert() {
    }

    public static Usuario usuarioToEntity(UsuarioDto usuarioDto){
        return new Usuario(usuarioDto.getName());
    }
}
