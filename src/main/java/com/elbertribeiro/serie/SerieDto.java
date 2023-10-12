package com.elbertribeiro.serie;

import jakarta.validation.constraints.NotNull;

/**
 * DTO for {@link Serie}
 */
public record SerieDto(
        @NotNull(message = "O titulo da obra não pode ser nulo")
        String titulo,
        @NotNull
        Integer plataforma,
        String nomePlataforma,
        @NotNull(message = "O tipo da obra não pode ser nulo")
        String tipo,
        Integer temporadas,
        Integer episodiosPorTemporada,
        Integer idUsuario,
        Boolean assistido,
        @NotNull(message = "A url da logo da plataforma não pode ser nulo")
        String urlLogo
) {
}