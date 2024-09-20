package org.project.film.repository;

import org.project.film.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, String> {

    List<Film> findByDirectorId(String director_id);
}