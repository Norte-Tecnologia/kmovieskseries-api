package com.elbertribeiro.kmovieskseries.model.dto;

import com.elbertribeiro.kmovieskseries.model.entity.Serie;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link Serie}
 */
public class SerieDto implements Serializable {
    @NotNull(message = "O titulo da obra não pode ser nulo")
    private final String titulo;
    @NotNull
    private final String plataforma;
    @NotNull
    private final String tipo;
    private final Integer temporadas;
    private final Integer episodiosPorTemporada;

    public SerieDto(String titulo, String plataforma, String tipo, Integer temporadas, Integer episodiosPorTemporada) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.tipo = tipo;
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public SerieDto(Serie serie) {
        this.titulo = serie.getTitulo();
        this.plataforma = serie.getPlataforma();
        this.tipo = serie.getTipo();
        this.temporadas = serie.getTemporadas();
        this.episodiosPorTemporada = getEpisodiosPorTemporada();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public Integer getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SerieDto entity = (SerieDto) o;
        return Objects.equals(this.titulo, entity.titulo) &&
                Objects.equals(this.plataforma, entity.plataforma) &&
                Objects.equals(this.tipo, entity.tipo) &&
                Objects.equals(this.temporadas, entity.temporadas) &&
                Objects.equals(this.episodiosPorTemporada, entity.episodiosPorTemporada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, plataforma, tipo, temporadas, episodiosPorTemporada);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "titulo = " + titulo + ", " +
                "plataforma = " + plataforma + ", " +
                "tipo = " + tipo + ", " +
                "temporadas = " + temporadas + ", " +
                "episodiosPorTemporada = " + episodiosPorTemporada + ")";
    }
}