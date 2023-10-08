package com.elbertribeiro.usuario;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TAB_USUARIO")
public class Usuario {
    @Id
    private String id;

    private String name;

    public Usuario(String name) {
        this.name = name;
    }

    public Usuario() {
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
}
