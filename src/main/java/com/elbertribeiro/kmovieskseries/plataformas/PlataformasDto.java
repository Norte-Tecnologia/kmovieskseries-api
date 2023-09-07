package com.elbertribeiro.kmovieskseries.plataformas;

public record PlataformasDto(
        Integer id,
        String name
) implements Plataformas {
    @Override
    public Integer getId() {
        return this.id;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
