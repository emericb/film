package org.project.film.controller;

import org.project.film.entity.Director;
import org.project.film.service.DirectorService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/director/")
public class DirectorController {

    private final DirectorService directorService;

    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping
    public ResponseEntity<List<Director>> getAllDirectors() {
        return ResponseEntity.ok(directorService.getAllDirectors());
    }

    @GetMapping("{id}")
    public ResponseEntity<Director> getDirectorById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(directorService.getDirectorById(id));
    }
}
