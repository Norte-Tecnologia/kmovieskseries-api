package com.elbertribeiro.serie;

import com.elbertribeiro.usuario.Usuario;
import com.elbertribeiro.plataformas.PlataformasConvert;

public class SerieConvert {
    private SerieConvert() {
    }

    public static SerieDto serieToDto(Serie serie) {
        return new SerieDto(
                serie.getTitulo(),
                PlataformasConvert.plataformaToDto(serie.getPlataforma()),
                serie.getPlataforma().getUrlLogo(),
                serie.getTipo(),
                serie.getTemporadas(),
                serie.getEpisodiosPorTemporada(),
                serie.getUsuario(),
                serie.getAssistido()
        );
    }

    public static Serie serieToEntity(SerieDto serie) {
        Serie serieEntity = new Serie();
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
