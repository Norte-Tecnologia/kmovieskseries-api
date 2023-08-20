package com.elbertribeiro.kmovieskseries.serie;

import com.elbertribeiro.kmovieskseries.serie.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
}
