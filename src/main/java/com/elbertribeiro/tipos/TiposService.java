package com.elbertribeiro.tipos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposService {
    private final TiposRepository tiposRepository;

    public TiposService(TiposRepository tiposRepository) {
        this.tiposRepository = tiposRepository;
    }

    public Tipos salvarTipo(Tipos tipos) {
        return tiposRepository.save(tipos);
    }

    public List<Tipos> listarTipos() {
        return tiposRepository.findAll();
    }
}
