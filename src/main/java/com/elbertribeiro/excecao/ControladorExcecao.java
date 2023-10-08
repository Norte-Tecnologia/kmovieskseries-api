package com.elbertribeiro.excecao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControladorExcecao {
    private static final Logger logger = LoggerFactory.getLogger(ControladorExcecao.class);
    @ExceptionHandler(ValidacaoExcecao.class)
    @ResponseBody
    InformacaoErro ouvinteErrosDeValidacao(ValidacaoExcecao excecaoDeValidacao, HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return new InformacaoErro(HttpStatus.BAD_REQUEST.value(), request.getRequestURI(), excecaoDeValidacao.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    InformacaoErro ouvinteExcecao(Exception excecao, HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        logger.error(excecao.getMessage(), excecao.getCause());
        return new InformacaoErro(response.getStatus(), request.getRequestURI(), excecao.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    InformacaoErro ouvinteErrosDeValidacaoSpring(MethodArgumentNotValidException excecao, HttpServletRequest request, HttpServletResponse response) {
        FieldError mensagem = excecao
                .getBindingResult()
                .getFieldErrors()
                .stream()
                .findFirst()
                .orElseThrow();
        response.setStatus(HttpStatus.BAD_REQUEST.value());
        return new InformacaoErro(
                response.getStatus(),
                request.getRequestURI(),
                "Erro no campo " + mensagem.getField() + ": " + mensagem.getDefaultMessage());
    }

    @ExceptionHandler(DataAccessResourceFailureException.class)
    @ResponseBody
    InformacaoErro ouvinteExcecao(DataAccessResourceFailureException excecao, HttpServletRequest request, HttpServletResponse response) {
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        logger.error(excecao.getMessage(), excecao.getCause());
        return new InformacaoErro(response.getStatus(), request.getRequestURI(), "Falha ao se conectar com o banco de dados");
    }
}
