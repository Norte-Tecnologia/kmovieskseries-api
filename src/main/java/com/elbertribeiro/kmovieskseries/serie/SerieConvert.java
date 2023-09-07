package com.elbertribeiro.kmovieskseries.serie;

import com.elbertribeiro.kmovieskseries.usuario.UsuarioEntity;

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
                serie.getUsuario().getId(),
                serie.getAssistido()
        );
    }

    public static Serie serieToEntity(SerieDto serie) {
        Serie serieEntity = new Serie();
        serieEntity.setPlataforma(serie.plataforma());
        serieEntity.setTipo(serie.tipo());
        serieEntity.setTitulo(serie.titulo());
        serieEntity.setTemporadas(serie.temporadas());
        serieEntity.setEpisodiosPorTemporada(serie.episodiosPorTemporada());
        UsuarioEntity usr = new UsuarioEntity();
        usr.setId(serie.idUsuario());
        serieEntity.setAssistido(serie.assistido());
        serieEntity.setUsuario(usr);
        return serieEntity;
    }
}
