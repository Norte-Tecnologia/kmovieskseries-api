package com.elbertribeiro.excecao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ControladorExcecao {
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
}
