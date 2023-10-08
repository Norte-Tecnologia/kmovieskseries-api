package com.elbertribeiro.kmovieskseries.usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "TAB_USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TU_ID")
    private Integer id;

    @Column(name = "TU_NAME")
    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    public Usuario() {
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
