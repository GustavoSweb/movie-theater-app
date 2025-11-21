package View;

import java.util.Scanner;
import java.util.stream.IntStream;
import Model.Movie;
import Model.Showing;

public class ShowingView {
    private Scanner scanner;

    public ShowingView() {
        this.scanner = new Scanner(System.in);
    }

    public int displayShowings(Movie movie) {
        System.out.println("=== Sessões de " + movie.getTitle() + " ===");
        
        if (movie.getShowings().isEmpty()) {
            System.out.println("Nenhuma sessão disponível para este filme.");
            return 0;
        } else {
            IntStream.range(1, movie.getShowings().size() + 1)
                    .forEach(index -> {
                        Showing showing = movie.getShowings().get(index - 1);
                        System.out.println(index + " - " + showing.getShowDate() + 
                            " às " + showing.getShowTime() + 
                            " - R$ " + showing.getPrice() +
                            " (" + showing.getAvailableTickets() + " ingressos)");
                    });
            
            System.out.print("\nDigite o número da sessão (0 para voltar): ");
            return scanner.nextInt();
        }
    }
}