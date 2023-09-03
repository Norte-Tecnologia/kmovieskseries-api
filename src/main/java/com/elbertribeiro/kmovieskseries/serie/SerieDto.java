package com.elbertribeiro.kmovieskseries.serie;

import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Serie}
 */
public record SerieDto(
        @NotNull(message = "O titulo da obra não pode ser nulo")
        String titulo,
        String plataforma,
        @NotNull
        String tipo,
        Integer temporadas,
        Integer episodiosPorTemporada
) {
    public SerieDto(@NotNull(message = "O titulo da obra não pode ser nulo")
                    String titulo, String plataforma, @NotNull
                    String tipo, Integer temporadas, Integer episodiosPorTemporada) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.tipo = tipo;
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public String plataforma() {
        return plataforma;
    }

    @Override
    public String tipo() {
        return tipo;
    }

    @Override
    public Integer temporadas() {
        return temporadas;
    }

    @Override
    public Integer episodiosPorTemporada() {
        return episodiosPorTemporada;
    }
}