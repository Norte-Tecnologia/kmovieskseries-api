package com.elbertribeiro.plataforma;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class PlataformaService {

    public List<PlataformaDto> buscaPlataformas(){
        List<PlataformaStreaming> list = Arrays.asList(PlataformaStreaming.values());
        return list.stream()
                .filter(plataformaStreaming -> plataformaStreaming.getId() != 0)
                .map(PlataformaConvert::plataformaToDto).toList();
    }

    public String buscaNomeById(Integer id){
        List<PlataformaStreaming> list = Arrays.asList(PlataformaStreaming.values());
        return list.stream()
                .filter(logo -> Objects.equals(logo.getId(), id))
                .map(PlataformaStreaming::getNome)
                .findFirst()
                .orElse("Plataforma não encontrada");
    }

    public String buscaUrlLogoById(Integer id){
        List<PlataformaStreaming> list = Arrays.asList(PlataformaStreaming.values());
        return list.stream()
                .filter(logo -> Objects.equals(logo.getId(), id))
                .map(PlataformaStreaming::getLogo)
                .findFirst()
                .orElse("Logo não encontrada");
    }
}
