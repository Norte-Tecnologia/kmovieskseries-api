package com.elbertribeiro.tipo;

import io.swagger.v3.oas.annotations.media.Schema;

public record TipoDto(
        Integer id,
        @Schema(description = "Nome do Tipo", example = "Série")
        String name
) {
}
