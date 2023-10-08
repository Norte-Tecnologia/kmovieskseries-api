package com.elbertribeiro.plataformas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataformasRepository extends JpaRepository<PlataformasEntity, Integer> {

    PlataformasEntity findAllByName(String name);
}