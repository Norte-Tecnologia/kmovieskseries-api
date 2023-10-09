package com.elbertribeiro.serie;

public enum PlataformaStreaming {
    NETFLIX(1, "Netflix", "logo_netflix.png"),
    YOUTUBE(2, "YouTube", "logo_youtube.png");

    private final Integer id;
    private final String nome;
    private final String logo;

    PlataformaStreaming(Integer id, String nome, String logo) {
        this.id = id;
        this.nome = nome;
        this.logo = logo;
    }

    public String getNome() {
        return nome;
    }

    public String getLogo() {
        return logo;
    }

    public Integer getId() {
        return id;
    }
}
