package com.elbertribeiro.serie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends MongoRepository<Serie, Long> {

    Serie findAllByTituloAndTipo(String titulo, Integer tipo);

    Serie findByTituloAndTipo(String titulo, Integer tipo);
}
