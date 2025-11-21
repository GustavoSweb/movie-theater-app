package Controller;

import Model.Movie;
import Repository.MovieRepository;
import View.MovieView;

public class MovieController {
    private MovieRepository movieRepository;
    private MovieView movieView;

    public MovieController(MovieRepository movieRepository, MovieView movieView) {
        this.movieRepository = movieRepository;
        this.movieView = movieView;
    }

    public void listMovies() {
        movieView.displayMovies(movieRepository.list());
    }
}