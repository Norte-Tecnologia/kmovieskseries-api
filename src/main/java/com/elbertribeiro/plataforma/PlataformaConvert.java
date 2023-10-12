package com.elbertribeiro.plataforma;

public class PlataformaConvert {

    private PlataformaConvert() {
        throw new IllegalStateException("Classe de Utilidade");
    }

    public static PlataformaDto plataformaToDto(PlataformaStreaming plataformaStreaming) {
        return new PlataformaDto(
                plataformaStreaming.getId(),
                plataformaStreaming.getNome(),
                plataformaStreaming.getLogo()
        );
    }

}
