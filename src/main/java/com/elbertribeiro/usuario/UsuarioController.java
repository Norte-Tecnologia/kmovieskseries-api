package com.elbertribeiro.usuario;

import com.elbertribeiro.excecao.ValidacaoExcecao;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
/*import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;*/
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import static org.springframework.http.ResponseEntity.status;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

 /*   @GetMapping
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", principal.getAttribute("name"));
        map.put("email", principal.getAttribute("email"));
        map.put("id", principal.getAttribute("sub"));
        return map;
    }*/

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody @Valid UsuarioDto usuarioDto) {
        return status(HttpStatus.CREATED)
                .body(usuarioService
                .createIdUser(Optional.ofNullable(usuarioDto)
                        .map(UsuarioConvert::usuarioToEntity)
                        .orElseThrow(() -> new ValidacaoExcecao("Erro ao criar usuario"))
                ));
    }
}
