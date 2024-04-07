package com.xyz.service.impl;

import com.xyz.dto.MovieDTO;
import com.xyz.entity.Movie;
import com.xyz.exception.ResourceNotFoundException;
import com.xyz.mapper.MovieMapper;
import com.xyz.repository.MovieRepository;
import com.xyz.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    /**
     * @param movieDTO
     */
    @Override
    public void add(MovieDTO movieDTO) {
        Movie movie = MovieMapper.mapToMovie(movieDTO);
        movieRepository.save(movie);
    }

    /**
     * @return
     */
    @Override
    public List<MovieDTO> getAllMovies() {
        List<Movie> movieList = movieRepository.findAll();
        List<MovieDTO> movieDTOList = movieList.stream().map(MovieMapper::mapToMovieDTO).toList();
        return movieDTOList;
    }

    /**
     * @param title
     * @return
     */
    @Override
    public MovieDTO getMovieByTitle(String title) {
        Movie movie = movieRepository.findByTitle(title)
             .orElseThrow(() -> new ResourceNotFoundException("Movie", "title", title));

        return  MovieMapper.mapToMovieDTO(movie);
    }
}
