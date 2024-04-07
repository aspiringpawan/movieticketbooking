package com.xyz.service;

import com.xyz.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    void add(MovieDTO movieDTO);

    List<MovieDTO> getAllMovies();

    MovieDTO getMovieByTitle(String title);
}
