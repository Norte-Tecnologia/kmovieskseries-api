package com.elbertribeiro.serie;


public class SerieConvert {
    private SerieConvert() {
    }

    public static SerieDto serieToDto(Serie serie) {
        return new SerieDto(
                serie.getTitulo(),
                serie.getPlataforma(),
                serie.getTipo(),
                serie.getTemporadas(),
                serie.getEpisodiosPorTemporada(),
                serie.getUsuario(),
                serie.getAssistido()
        );
    }

    public static Serie serieToEntity(NovaSerieDto serie) {
        Serie serieEntity = new Serie();
        serieEntity.setPlataforma(serie.getStreaming().getNome());
        serieEntity.setTipo(serie.getTipo());
        serieEntity.setTitulo(serie.getTitulo());
        serieEntity.setTemporadas(serie.getTemporadas());
        serieEntity.setEpisodiosPorTemporada(serie.getEpisodiosPorTemporada());
        serieEntity.setUsuario(serie.getIdUsuario());
        return serieEntity;
    }
}
