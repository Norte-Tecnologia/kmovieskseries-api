package com.elbertribeiro.serie;

import com.elbertribeiro.plataforma.PlataformaStreaming;
import jakarta.validation.constraints.NotBlank;

/**
 * DTO for {@link Serie}
 */
public class NovaSerieDto {
    @NotBlank(message = "O titulo da obra não pode ser nulo")
    private String titulo;
    @NotBlank
    private PlataformaStreaming streaming;
    @NotBlank
    private String tipo;
    @NotBlank
    private Integer temporadas;
    @NotBlank
    private Integer episodiosPorTemporada;
    @NotBlank
    private Integer idUsuario;
    @NotBlank
    private Boolean assistido;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public PlataformaStreaming getStreaming() {
        return streaming;
    }

    public void setStreaming(PlataformaStreaming streaming) {
        this.streaming = streaming;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

    public Integer getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(Integer episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Boolean getAssistido() {
        return assistido;
    }

    public void setAssistido(Boolean assistido) {
        this.assistido = assistido;
    }
}

