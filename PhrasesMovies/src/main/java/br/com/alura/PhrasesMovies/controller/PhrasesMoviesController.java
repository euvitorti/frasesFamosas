package br.com.alura.PhrasesMovies.controller;

import br.com.alura.PhrasesMovies.dto.PhrasesMoviesDTO;
import br.com.alura.PhrasesMovies.service.PhrasesMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhrasesMoviesController {

    @Autowired
    private PhrasesMoviesService phrasesMoviesService;

    @GetMapping("/series/frases")
    public PhrasesMoviesDTO phrasesMoviesDTO() {
        return phrasesMoviesService.getRandomPhrase();
    }
}
