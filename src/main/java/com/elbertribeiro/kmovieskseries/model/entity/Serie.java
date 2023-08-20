package com.elbertribeiro.kmovieskseries.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String plataforma;
    private String tipo;
    private Integer temporadas;
    private Integer episodiosPorTemporada;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Integer getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(Integer episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(id, serie.id) && Objects.equals(titulo, serie.titulo) && Objects.equals(plataforma, serie.plataforma) && Objects.equals(tipo, serie.tipo) && Objects.equals(temporadas, serie.temporadas) && Objects.equals(episodiosPorTemporada, serie.episodiosPorTemporada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, plataforma, tipo, temporadas, episodiosPorTemporada);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", tipo='" + tipo + '\'' +
                ", temporadas=" + temporadas +
                ", episodiosPorTemporada=" + episodiosPorTemporada +
                '}';
    }
}
