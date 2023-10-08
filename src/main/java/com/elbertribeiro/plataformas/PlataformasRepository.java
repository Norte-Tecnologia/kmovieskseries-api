package com.elbertribeiro.plataformas;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformasRepository extends MongoRepository<Plataformas, String> {

    Plataformas findAllByName(String name);
}
