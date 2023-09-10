package com.elbertribeiro.kmovieskseries.plataformas;

public record PlataformasDto(
        Long id,
        String name,
        String urlLogo
) implements Plataformas {
    @Override
    public Long getId() {
        return this.id;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String getUrlLogo() {
        return this.urlLogo;
    }
}
