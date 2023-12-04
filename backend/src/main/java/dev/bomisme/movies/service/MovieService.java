package dev.bomisme.movies.service;

import dev.bomisme.movies.model.Movie;
import dev.bomisme.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}