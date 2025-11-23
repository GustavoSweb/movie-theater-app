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

    public int displayMovies(List<Movie> movies) {
        System.out.println("=== Lista de Filmes ===");
        IntStream.range(0, movies.size())
                .forEach(index -> {
                    Movie movie = movies.get(index);
                    System.out.println((index + 1) + " - " + movie.getTitle());
                });

        System.out.print("Digite o índice do filme (0 para sair): ");
        return scanner.nextInt();
    }
}
