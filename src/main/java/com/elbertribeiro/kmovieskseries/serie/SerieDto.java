package com.elbertribeiro.kmovieskseries.serie;

import jakarta.validation.constraints.NotNull;

/**
 * DTO for {@link Serie}
 */
public record SerieDto(
        @NotNull(message = "O titulo da obra não pode ser nulo")
        String titulo,
        String plataforma,
        String urlLogo,
        @NotNull
        String tipo,
        Integer temporadas,
        Integer episodiosPorTemporada,
        Integer idUsuario,
        Boolean assistido
) {
}