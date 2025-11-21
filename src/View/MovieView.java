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
        IntStream.range(1, movies.size() + 1)
                .forEach(index -> {
                    Movie movie = movies.get(index - 1);
                    System.out.println(index + " - " + movie.getTitle());
                });
        
        System.out.print("\nDigite o número do filme para ver as sessões (0 para voltar): ");
        return scanner.nextInt();
    }

}
