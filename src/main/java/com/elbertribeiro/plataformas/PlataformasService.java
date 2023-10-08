package com.elbertribeiro.plataformas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlataformasService {
    private final PlataformasRepository plataformasRepository;

    public PlataformasService(PlataformasRepository plataformasRepository) {
        this.plataformasRepository = plataformasRepository;
    }

    public Plataformas salvarPlataforma(Plataformas plataformas) {
        return plataformasRepository.save(plataformas);
    }

    public Plataformas listarPlataformasByNome(String name) {
        return Optional
                .ofNullable(plataformasRepository
                        .findAllByName(name)).orElseThrow(() -> new RuntimeException("Plataforma não encontrada"));
    }

    public List<Plataformas> listarPlataformas() {
        return plataformasRepository.findAll();
    }
}
