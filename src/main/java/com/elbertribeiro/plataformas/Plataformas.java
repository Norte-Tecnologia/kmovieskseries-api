package com.elbertribeiro.plataformas;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TAB_PLATAFORMAS")
public class Plataformas {
    @Id
    @Column(name = "TP_ID")
    private String id;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
