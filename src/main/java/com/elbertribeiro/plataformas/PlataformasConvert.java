package com.elbertribeiro.plataformas;

public class PlataformasConvert {
    private PlataformasConvert() {
    }

    public static PlataformasDto plataformaToDto(Plataformas plataformas) {
        return new PlataformasDto(
                plataformas.getId(),
                plataformas.getName(),
                plataformas.getUrlLogo()
        );
    }

    public static Plataformas plataformaToEntity(PlataformasDto plataformasDto) {
        Plataformas plataformas = new Plataformas();
        plataformas.setId(plataformasDto.id());
        plataformas.setName(plataformasDto.name());
        plataformas.setUrlLogo(plataformasDto.urlLogo());
        return plataformas;
    }

    public static Plataformas plataformaToEntity(NovaPlataformaDto plataformasDto) {
        Plataformas plataformas = new Plataformas();
        plataformas.setName(plataformasDto.getName());
        return plataformas;
    }
}
