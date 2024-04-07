package com.xyz.controller;

import com.xyz.dto.MovieDTO;
import com.xyz.entity.Movie;
import com.xyz.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping (path = "/movies", produces = {MediaType.APPLICATION_JSON_VALUE})
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping(path="/add")
    public ResponseEntity addMovie(@RequestBody MovieDTO movieDTO) {
        movieService.add(movieDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<MovieDTO> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{title}")
    public MovieDTO getMovieByTitle(@PathVariable String title) {
        return movieService.getMovieByTitle(title);
    }
}
