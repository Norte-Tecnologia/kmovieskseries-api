package com.elbertribeiro.excecao;

import io.swagger.v3.oas.annotations.media.Schema;

public record InformacaoErro(
        @Schema(description = "Status Http", example = "500")
        Integer httpStatus,

        @Schema(description = "Recurso que Gerou o erro", example = "/recursoGenerico")
        String url,

        @Schema(description = "Mensagem de erro capturada pela Exception", example = "Erro Interno no Servidor")
        String mensagemErro
) {
}
