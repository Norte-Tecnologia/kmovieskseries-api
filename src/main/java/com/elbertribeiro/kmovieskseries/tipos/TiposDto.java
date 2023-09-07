package com.elbertribeiro.kmovieskseries.tipos;

public record TiposDto(
        Integer id,
        String name
) implements Tipos {
    @Override
    public Integer getId() {
        return this.id;
    }
    @Override
    public String getName() {
        return this.name;
    }
}
