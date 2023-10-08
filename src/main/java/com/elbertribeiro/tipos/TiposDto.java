package com.elbertribeiro.tipos;

import io.swagger.v3.oas.annotations.media.Schema;

public record TiposDto(
        String id,
        @Schema(description = "Nome da plataforma", example = "Netflix")
        String name
) {
}
