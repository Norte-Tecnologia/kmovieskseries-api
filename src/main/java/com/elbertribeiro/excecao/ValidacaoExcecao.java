package com.elbertribeiro.excecao;

public class ValidacaoExcecao extends IllegalArgumentException {
    private static final long serialVersionUID = 1L;
    private final String nomeCampo;

    public ValidacaoExcecao(String mensagem) {
        super(mensagem);
        this.nomeCampo = null;
    }

    public ValidacaoExcecao(String nomeCampo, String mensagem) {
        super(mensagem);
        this.nomeCampo = nomeCampo;
    }

    public ValidacaoExcecao(String nomeCampo, String mensagem, Throwable e) {
        super(mensagem, e);
        this.nomeCampo = nomeCampo;
    }

    public ValidacaoExcecao(String mensagem, Throwable e) {
        super(mensagem, e);
        this.nomeCampo = null;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }
}
