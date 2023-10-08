package com.elbertribeiro.tipos;

import jakarta.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("TAB_TIPOS")
public class Tipos {
    @Id
    private String id;

    @Column(name = "TT_NAME")
    private String name;

    public Tipos(String name) {
        this.name = name;
    }

    public Tipos() {
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
