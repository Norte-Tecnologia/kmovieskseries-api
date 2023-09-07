package com.elbertribeiro.kmovieskseries.plataformas;

import jakarta.persistence.*;

@Entity
@Table(name = "TAB_PLATAFORMAS")
public class PlataformasEntity implements Plataformas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TP_ID")
    private Integer id;

    @Column(name = "TP_NAME")
    private String name;

    public PlataformasEntity(String name) {
        this.name = name;
    }

    public PlataformasEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
