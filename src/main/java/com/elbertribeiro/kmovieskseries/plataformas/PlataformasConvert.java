package com.elbertribeiro.kmovieskseries.plataformas;

public class PlataformasConvert {
    public PlataformasConvert() {
    }

    public static PlataformasDto plataformaToDto(PlataformasEntity plataformasEntity) {
        return new PlataformasDto(
                plataformasEntity.getId(),
                plataformasEntity.getName(),
                plataformasEntity.getUrlLogo()
        );
    }

    public static PlataformasEntity plataformaToEntity(PlataformasDto plataformasDto) {
        PlataformasEntity plataformasEntity = new PlataformasEntity();
        plataformasEntity.setId(plataformasDto.id());
        plataformasEntity.setName(plataformasDto.name());
        plataformasEntity.setUrlLogo(plataformasDto.getUrlLogo());
        return plataformasEntity;
    }
}
