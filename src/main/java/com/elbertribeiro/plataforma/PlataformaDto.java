package com.elbertribeiro.plataforma;

import jakarta.validation.constraints.NotNull;

public record PlataformaDto(
        @NotNull(message = "O id da plataforma não pode ser nulo")
        Integer id,
        @NotNull(message = "O nome da plataforma não pode ser nulo")
        String name,
        String urlLogo
        ) {
}
