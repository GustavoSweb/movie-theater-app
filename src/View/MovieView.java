package View;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

import Model.Movie;

public class MovieView {
    private Scanner scanner;

    public MovieView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMovies(List<Movie> movies) {
        System.out.println("=== Lista de Filmes ===");
        IntStream.range(0, movies.size())
                .forEach(index -> {
                    Movie movie = movies.get(index);
                    System.out.println(index + " - " + movie.getTitle());
                });

    }
}
