package br.com.alura.PhrasesMovies.service;

import br.com.alura.PhrasesMovies.dto.PhrasesMoviesDTO;
import br.com.alura.PhrasesMovies.model.PhrasesMovies;
import br.com.alura.PhrasesMovies.repository.PhrasesMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhrasesMoviesService {

    @Autowired
    private PhrasesMoviesRepository phrasesMoviesRepository;

    public PhrasesMoviesDTO getRandomPhrase() {

        // A LETRA L, É USADA PARA DECLARAR QUE É UM LONG
        PhrasesMovies phrasesMovies = phrasesMoviesRepository.phrasesMoviesRandom();
        return new PhrasesMoviesDTO(phrasesMovies.getTitle(), phrasesMovies.getPhrase(), phrasesMovies.getCharacter(), phrasesMovies.getPoster());
    }
}
