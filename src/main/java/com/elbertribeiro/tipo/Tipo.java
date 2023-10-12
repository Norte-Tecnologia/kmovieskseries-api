package com.elbertribeiro.tipo;

public enum Tipo {
    SERIE(1, "Série"),
    FILME(2, "Filme"),
    DOCUMENTARIO(3, "Documentário"),
    ANIME(4, "Anime"),
    MUSICA(5, "Música"),
    SHOW(6, "Show");

    private final Integer id;
    private final String nome;

    Tipo(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
