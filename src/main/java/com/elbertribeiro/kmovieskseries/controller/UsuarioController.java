package com.elbertribeiro.kmovieskseries.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @GetMapping
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        Map<String, Object>  map = new HashMap<>();
        map.put("name", principal.getAttribute("name"));
        map.put("email", principal.getAttribute("email"));
        return map;
    }
}
