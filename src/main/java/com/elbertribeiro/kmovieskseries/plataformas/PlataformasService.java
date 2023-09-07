package com.elbertribeiro.kmovieskseries.plataformas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlataformasService {
    private final PlataformasRepository plataformasRepository;

    public PlataformasService(PlataformasRepository plataformasRepository) {
        this.plataformasRepository = plataformasRepository;
    }

    public PlataformasEntity salvarPlataforma(PlataformasEntity plataformasEntity) {
        return plataformasRepository.save(plataformasEntity);
    }

    public List<PlataformasEntity> listarPlataformas() {
        return plataformasRepository.findAll();
    }
}
