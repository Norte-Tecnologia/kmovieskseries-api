package com.elbertribeiro.kmovieskseries.usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Integer createIdUser(UsuarioEntity usuarioEntity){
        return usuarioRepository.save(usuarioEntity).getId();
    }
}
