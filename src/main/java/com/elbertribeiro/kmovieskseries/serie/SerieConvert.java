package com.elbertribeiro.kmovieskseries.serie;

public class SerieConvert {
    private SerieConvert() {
    }

    public static SerieDto serieToDto(Serie serie) {
        return new SerieDto(
                serie.getTitulo(),
                serie.getPlataforma(),
                serie.getTipo(),
                serie.getTemporadas(),
                serie.getEpisodiosPorTemporada()
        );
    }

    public static Serie serieToEntity(SerieDto serie) {
        return new Serie(
                serie.titulo(),
                serie.plataforma(),
                serie.tipo(),
                serie.temporadas(),
                serie.episodiosPorTemporada()
        );
    }
}
