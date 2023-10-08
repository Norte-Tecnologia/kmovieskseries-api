package com.elbertribeiro.kmovieskseries.usuario;

import org.springframework.http.HttpStatus;
/*import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;*/
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
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
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public String createUser(@RequestBody UsuarioDto usuarioDto) {
        return usuarioService
                .createIdUser(Optional.ofNullable(usuarioDto)
                        .map(UsuarioConvert::usuarioToEntity)
                        .orElseThrow()
                );
    }
}
