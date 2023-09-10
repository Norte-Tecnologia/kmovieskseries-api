package com.elbertribeiro.kmovieskseries.serie;

import com.elbertribeiro.kmovieskseries.usuario.UsuarioEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "TAB_SERIE")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TS_ID")
    private Long id;
    @Column(name = "TS_TITULO")
    private String titulo;
    //@OneToMany
    private String plataforma;
    private String urlLogo;
    @Column(name = "TS_TIPO")
    private String tipo;
    @Column(name = "TS_TEMPORADAS")
    private Integer temporadas;
    @Column(name = "TS_EPISODIOS_POR_TEMPORADA")
    private Integer episodiosPorTemporada;
    @Column(name = "TS_ASSISTIDO")
    private Boolean assistido;
    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "TU_ID", nullable = false)
    private UsuarioEntity usuario;
//    @OneToMany(mappedBy="serie")
//    private Set<PlataformasEntity> plataformasEntity;

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

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }

    public Boolean getAssistido() {
        return assistido;
    }

    public void setAssistido(Boolean assistido) {
        this.assistido = assistido;
    }

//    public Set<PlataformasEntity> getPlataformasEntity() {
//        return plataformasEntity;
//    }
//
//    public void setPlataformasEntity(Set<PlataformasEntity> plataformasEntity) {
//        this.plataformasEntity = plataformasEntity;
//    }


    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }
}
