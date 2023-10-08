package com.elbertribeiro.serie;

import com.elbertribeiro.usuario.Usuario;

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

    public static Serie serieToEntity(SerieDto serie) {
        Serie serieEntity = new Serie();
        serieEntity.setPlataforma(serieEntity.getPlataforma());
        serieEntity.setTipo(serie.tipo());
        serieEntity.setTitulo(serie.titulo());
        serieEntity.setTemporadas(serie.temporadas());
        serieEntity.setEpisodiosPorTemporada(serie.episodiosPorTemporada());
        Usuario usr = new Usuario();
        usr.setId(String.valueOf(serie.idUsuario()));
        serieEntity.setAssistido(serie.assistido());
        serieEntity.setUsuario(serieEntity.getUsuario());
        return serieEntity;
    }
}
