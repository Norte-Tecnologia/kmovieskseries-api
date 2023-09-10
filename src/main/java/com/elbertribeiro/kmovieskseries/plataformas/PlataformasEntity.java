package com.elbertribeiro.kmovieskseries.plataformas;

import com.elbertribeiro.kmovieskseries.serie.Serie;
import jakarta.persistence.*;

@Entity
@Table(name = "TAB_PLATAFORMAS")
public class PlataformasEntity implements Plataformas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TP_ID")
    private Long id;

    @Column(name = "TP_NAME")
    private String name;

    @Column(name = "TP_URL_LOGO")
    private String urlLogo;

//    @ManyToOne
//    @JoinColumn(name = "ID_SERIE", referencedColumnName = "TS_ID", nullable = false)
//    private Serie serie;

    public PlataformasEntity(String name, String urlLogo) {
        this.name = name;
        this.urlLogo = urlLogo;
    }

    public PlataformasEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

//    public Serie getSerie() {
//        return serie;
//    }
//
//    public void setSerie(Serie serie) {
//        this.serie = serie;
//    }
}
