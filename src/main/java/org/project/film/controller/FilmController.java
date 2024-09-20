package org.project.film.controller;

import org.project.film.entity.Film;
import org.project.film.service.FilmService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/catalog/")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms() {
        return ResponseEntity.ok(filmService.getAllFilms());
    }

    @GetMapping("{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(filmService.getFilmById(id));
    }

    @GetMapping("director/{id}")
    public ResponseEntity<List<Film>> getFilmsByDirectorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(filmService.getFilmsByDirectorId(id));
    }
}