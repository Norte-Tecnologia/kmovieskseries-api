package com.elbertribeiro.kmovieskseries.tipos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiposRepository extends JpaRepository<TiposEntity, Integer> {
}
