package com.xyz.mapper;

import com.xyz.dto.MovieDTO;
import com.xyz.entity.Movie;

public class MovieMapper {

    public static Movie mapToMovie(MovieDTO movieDTO) {
        Movie movie = new Movie();
        movie.setTitle(movieDTO.getTitle());
        movie.setGenre(movieDTO.getGenre());
        movie.setAudio(movieDTO.getAudio());
        movie.setDuration(movieDTO.getDuration());
        movie.setDescription(movieDTO.getDescription());
        movie.setReleaseDate(movieDTO.getReleaseDate());
        return movie;
    }

    public static MovieDTO mapToMovieDTO(Movie movie) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setTitle(movie.getTitle());
        movieDTO.setGenre(movie.getGenre());
        movieDTO.setAudio(movie.getAudio());
        movieDTO.setDuration(movie.getDuration());
        movieDTO.setDescription(movie.getDescription());
        movieDTO.setReleaseDate(movie.getReleaseDate());
        return movieDTO;
    }

}
