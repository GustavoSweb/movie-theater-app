import java.util.Scanner;
import Controller.MovieController;
import Repository.MovieRepository;
import View.MovieView;

public class App {
    private Scanner scanner;
    private MovieController movieController;

    public App() {
        this.scanner = new Scanner(System.in);
        MovieRepository movieRepository = new MovieRepository();
        MovieView movieView = new MovieView();
        this.movieController = new MovieController(movieRepository, movieView);
    }

    public void showMenu() {
        int option;
        do {
            System.out.println("\n=== CINEMA SYSTEM ===");
            System.out.println("1. Filmes");
            System.out.println("2. Ingressos comprados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    movieController.listMovies();
                    break;
                case 2:
                    System.out.println("Funcionalidade em desenvolvimento");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);
    }

    public static void main(String[] args) {
        new App().showMenu();
    }
}
