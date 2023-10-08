package com.elbertribeiro.serie;

import com.elbertribeiro.plataformas.PlataformasEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "TAB_SERIE")
public class SerieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TS_ID")
    private Long id;
    @Column(name = "TS_TITULO")
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "TS_PLATAFORMA", referencedColumnName = "TP_ID", nullable = false)
    private PlataformasEntity plataforma;
    @Column(name = "TS_TIPO")
    private String tipo;
    @Column(name = "TS_TEMPORADAS")
    private Integer temporadas;
    @Column(name = "TS_EPISODIOS_POR_TEMPORADA")
    private Integer episodiosPorTemporada;
    @Column(name = "TS_ASSISTIDO")
    private Boolean assistido;
    @Column(name = "ID_USUARIO")
    private Integer usuario;

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

    public PlataformasEntity getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(PlataformasEntity plataforma) {
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
