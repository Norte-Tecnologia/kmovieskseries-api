package com.elbertribeiro.kmovieskseries.repository;

import com.elbertribeiro.kmovieskseries.model.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
}
