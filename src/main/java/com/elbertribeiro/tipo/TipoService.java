package com.elbertribeiro.tipo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class TipoService {

    public List<TipoDto> buscaTipos(){
        List<Tipo> list = Arrays.asList(Tipo.values());
        return list.stream()
                .filter(tipo -> tipo.getId() != 0)
                .map(TipoConvert::tipoToDto).toList();
    }

    public String buscaNomeTipoById(Integer id){
        List<Tipo> list = Arrays.asList(Tipo.values());
        return list.stream()
                .filter(tipo -> Objects.equals(tipo.getId(), id))
                .map(Tipo::getNome)
                .findFirst()
                .orElse("Tipo não encontrado");
    }
}
