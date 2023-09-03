package com.elbertribeiro.kmovieskseries.usuario;

public class UsuarioConvert {
    private UsuarioConvert() {
    }

    public static UsuarioEntity usuarioToEntity(UsuarioDto usuarioDto){
        return new UsuarioEntity(usuarioDto.nomeUsuario());
    }
}
