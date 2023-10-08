package com.elbertribeiro.serie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends MongoRepository<Serie, Long> {

    Serie findAllByTitulo(String titulo);
}
