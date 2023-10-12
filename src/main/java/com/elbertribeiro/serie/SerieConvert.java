package com.elbertribeiro.serie;


import com.elbertribeiro.plataforma.PlataformaService;
import org.springframework.stereotype.Service;

@Service
public class SerieConvert {

    private final PlataformaService plataformaService;

    public SerieConvert(PlataformaService plataformaService) {
        this.plataformaService = plataformaService;
    }


    public SerieDto serieToDto(Serie serie) {
        return new SerieDto(
                serie.getTitulo(),
                serie.getPlataforma(),
                plataformaService.buscaNomeById(serie.getPlataforma()),
                serie.getTipo(),
                serie.getTemporadas(),
                serie.getEpisodiosPorTemporada(),
                serie.getUsuario(),
                serie.getAssistido(),
                plataformaService.buscaUrlLogoById(serie.getPlataforma())
        );
    }

    public Serie serieToEntity(NovaSerieDto serie) {
        Serie serieEntity = new Serie();
        serieEntity.setPlataforma(serie.getStreaming().getId());
        serieEntity.setTipo(serie.getTipo());
        serieEntity.setTitulo(serie.getTitulo());
        serieEntity.setTemporadas(serie.getTemporadas());
        serieEntity.setEpisodiosPorTemporada(serie.getEpisodiosPorTemporada());
        serieEntity.setUsuario(serie.getIdUsuario());
        serieEntity.setAssistido(serie.getAssistido());
        return serieEntity;
    }
}
