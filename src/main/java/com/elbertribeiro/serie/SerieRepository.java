package com.elbertribeiro.serie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends MongoRepository<Serie, Long> {

    Serie findAllByTituloAndTipo(String titulo, String tipo);

    Serie findByTituloAndTipo(String titulo, String tipo);
}
