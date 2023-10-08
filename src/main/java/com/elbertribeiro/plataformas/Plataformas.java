package com.elbertribeiro.plataformas;

import jakarta.persistence.*;

@Entity
@Table(name = "TAB_PLATAFORMAS")
public class Plataformas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TP_ID")
    private Long id;

    @Column(name = "TP_NAME")
    private String name;

    @Column(name = "TP_URL_LOGO")
    private String urlLogo;

    public Plataformas(String name, String urlLogo) {
        this.name = name;
        this.urlLogo = urlLogo;
    }

    public Plataformas() {
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
}
