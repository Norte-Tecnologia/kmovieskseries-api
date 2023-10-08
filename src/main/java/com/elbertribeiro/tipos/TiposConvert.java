package com.elbertribeiro.tipos;

public class TiposConvert {
    public TiposConvert() {
    }

    public static TiposDto tipoToDto(TiposEntity tiposEntity) {
        return new TiposDto(
                tiposEntity.getId(),
                tiposEntity.getName()
        );
    }

    public static TiposEntity tipoToEntity(TiposDto tiposDto) {
        TiposEntity tiposEntity = new TiposEntity();
        tiposEntity.setId(tiposDto.id());
        tiposEntity.setName(tiposDto.name());
        return tiposEntity;
    }
}
