package com.elbertribeiro.serie;

import com.elbertribeiro.usuario.Usuario;
import com.elbertribeiro.plataformas.PlataformasConvert;

public class SerieConvert {
    private SerieConvert() {
    }

    public static SerieDto serieToDto(SerieEntity serieEntity) {
        return new SerieDto(
                serieEntity.getTitulo(),
                PlataformasConvert.plataformaToDto(serieEntity.getPlataforma()),
                serieEntity.getPlataforma().getUrlLogo(),
                serieEntity.getTipo(),
                serieEntity.getTemporadas(),
                serieEntity.getEpisodiosPorTemporada(),
                serieEntity.getUsuario(),
                serieEntity.getAssistido()
        );
    }

    public static SerieEntity serieToEntity(SerieDto serie) {
        SerieEntity serieEntity = new SerieEntity();
        serieEntity.setPlataforma(PlataformasConvert.plataformaToEntity(serie.plataforma()));
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
