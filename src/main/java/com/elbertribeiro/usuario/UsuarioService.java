package com.elbertribeiro.usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public String createIdUser(Usuario usuario) {
        return this.criandoMensagem(usuarioRepository.save(usuario).getId());
    }

    private String criandoMensagem(String idUsuario) {
        return "Usuario criado com sucesso sob o registro: " + idUsuario;
    }
}
