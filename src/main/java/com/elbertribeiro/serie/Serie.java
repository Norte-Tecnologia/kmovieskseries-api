package com.elbertribeiro.serie;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TAB_SERIE")
public class Serie {
    @Id
    @Column(name = "TS_ID")
    private String id;
    @Column(name = "TS_TITULO")
    private String titulo;
    @Column(name = "TS_PLATAFORMA")
    private Integer plataforma;
    @Column(name = "TS_TIPO")
    private Integer tipo;
    @Column(name = "TS_TEMPORADAS")
    private Integer temporadas;
    @Column(name = "TS_EPISODIOS_POR_TEMPORADA")
    private Integer episodiosPorTemporada;
    @Column(name = "TS_ASSISTIDO")
    private Boolean assistido;
    @Column(name = "ID_USUARIO")
    private Integer usuario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Integer plataforma) {
        this.plataforma = plataforma;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
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

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Boolean getAssistido() {
        return assistido;
    }

    public void setAssistido(Boolean assistido) {
        this.assistido = assistido;
    }
}
