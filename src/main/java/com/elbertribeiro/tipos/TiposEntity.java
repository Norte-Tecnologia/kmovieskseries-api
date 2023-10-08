package com.elbertribeiro.tipos;

import jakarta.persistence.*;

@Entity
@Table(name = "TAB_TIPOS")
public class TiposEntity implements Tipos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TT_ID")
    private Integer id;

    @Column(name = "TT_NAME")
    private String name;

    public TiposEntity(String name) {
        this.name = name;
    }

    public TiposEntity() {
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
