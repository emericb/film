package org.project.film.service;

import org.project.film.entity.Film;
import org.project.film.repository.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    public Film getFilmById(Long id) {
        return filmRepository.findById(String.valueOf(id)).orElse(null);
    }

    public List<Film> getFilmsByDirectorId(Long id) {
        return filmRepository.findByDirectorId(String.valueOf(id));
    }
}
