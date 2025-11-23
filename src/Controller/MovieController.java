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

    public Movie listMovies() {
        int index = movieView.displayMovies(movieRepository.list());
        
        if (index == 0) {
            return null;
        }
        
        if (index < 1 || index > movieRepository.list().size()) {
            System.out.println("Índice inválido!");
            return null;
        }
        
        return movieRepository.list().get(index - 1);
    }
}