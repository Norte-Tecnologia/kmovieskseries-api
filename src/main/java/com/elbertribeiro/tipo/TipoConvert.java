package com.elbertribeiro.tipo;

public class TipoConvert {
    private TipoConvert() {
    }

    public static TipoDto tipoToDto(Tipo tipo) {
        return new TipoDto(
                tipo.getId(),
                tipo.getNome()
        );
    }
}
