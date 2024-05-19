package br.com.alura.PhrasesMovies.repository;

import br.com.alura.PhrasesMovies.model.PhrasesMovies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhrasesMoviesRepository extends JpaRepository<PhrasesMovies, Long> {

    // FRASES ALEATÓRIAS
    @Query("SELECT f FROM PhrasesMovies f ORDER BY function('RANDOM') LIMIT 1")
    PhrasesMovies phrasesMoviesRandom();
}
