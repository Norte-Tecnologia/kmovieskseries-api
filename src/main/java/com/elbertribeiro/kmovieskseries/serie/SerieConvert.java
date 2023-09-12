package com.elbertribeiro.kmovieskseries.serie;

import com.elbertribeiro.kmovieskseries.usuario.UsuarioEntity;

public class SerieConvert {
    private SerieConvert() {
    }

    public static SerieDto serieToDto(SerieEntity serieEntity) {
        return new SerieDto(
                serieEntity.getTitulo(),
                serieEntity.getPlataforma(),
                serieEntity.getUrlLogo(),
                serieEntity.getTipo(),
                serieEntity.getTemporadas(),
                serieEntity.getEpisodiosPorTemporada(),
                serieEntity.getUsuario().getId(),
                serieEntity.getAssistido()
        );
    }

    public static SerieEntity serieToEntity(SerieDto serie) {
        SerieEntity serieEntity = new SerieEntity();
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
