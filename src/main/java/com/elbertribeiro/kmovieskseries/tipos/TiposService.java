package com.elbertribeiro.kmovieskseries.tipos;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposService {
    private final TiposRepository tiposRepository;

    public TiposService(TiposRepository tiposRepository) {
        this.tiposRepository = tiposRepository;
    }

    public TiposEntity salvarTipo(TiposEntity tiposEntity) {
        return tiposRepository.save(tiposEntity);
    }

    public List<TiposEntity> listarTipos() {
        return tiposRepository.findAll();
    }
}
