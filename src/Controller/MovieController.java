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

    public Movie selectMovie() {
        int selectedIndex;
        do {
            selectedIndex = movieView.displayMovies(movieRepository.list());
            
            if (selectedIndex == 0) {
                return null;
            } else if (selectedIndex >= 1 && selectedIndex <= movieRepository.list().size()) {
                return movieRepository.list().get(selectedIndex - 1);
            } else {
                System.out.println("Índice inválido! Tente novamente.");
            }
        } while (true);
    }

    public void listMovies() {
        movieView.displayMovies(movieRepository.list());
    }

}