package com.elbertribeiro.kmovieskseries.serie;

import com.elbertribeiro.kmovieskseries.usuario.Usuario;

import static com.elbertribeiro.kmovieskseries.plataformas.PlataformasConvert.plataformaToDto;
import static com.elbertribeiro.kmovieskseries.plataformas.PlataformasConvert.plataformaToEntity;

public class SerieConvert {
    private SerieConvert() {
    }

    public static SerieDto serieToDto(SerieEntity serieEntity) {
        return new SerieDto(
                serieEntity.getTitulo(),
                plataformaToDto(serieEntity.getPlataforma()),
                serieEntity.getPlataforma().getUrlLogo(),
                serieEntity.getTipo(),
                serieEntity.getTemporadas(),
                serieEntity.getEpisodiosPorTemporada(),
                serieEntity.getUsuario().getId(),
                serieEntity.getAssistido()
        );
    }

    public static SerieEntity serieToEntity(SerieDto serie) {
        SerieEntity serieEntity = new SerieEntity();
        serieEntity.setPlataforma(plataformaToEntity(serie.plataforma()));
        serieEntity.setTipo(serie.tipo());
        serieEntity.setTitulo(serie.titulo());
        serieEntity.setTemporadas(serie.temporadas());
        serieEntity.setEpisodiosPorTemporada(serie.episodiosPorTemporada());
        Usuario usr = new Usuario();
        usr.setId(serie.idUsuario());
        serieEntity.setAssistido(serie.assistido());
        serieEntity.setUsuario(usr);
        return serieEntity;
    }
}
