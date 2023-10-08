package com.elbertribeiro.tipos;

public class TiposConvert {
    public TiposConvert() {
    }

    public static TiposDto tipoToDto(Tipos tipos) {
        return new TiposDto(
                tipos.getId(),
                tipos.getName()
        );
    }

    public static Tipos tipoToEntity(TiposDto tiposDto) {
        Tipos tipos = new Tipos();
        tipos.setId(tiposDto.id());
        tipos.setName(tiposDto.name());
        return tipos;
    }
}
