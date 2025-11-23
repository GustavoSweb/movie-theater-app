import java.util.Scanner;
import Controller.MovieController;
import Controller.ShowingController;
import Controller.TicketController;
import Repository.MovieRepository;
import Repository.ShowingRepository;
import Repository.TicketRepository;
import View.MovieView;
import View.ShowingView;
import View.TicketView;
import Model.Movie;
import Model.Showing;
import Model.User;

public class App {
    private Scanner scanner;
    private MovieController movieController;
    private ShowingController showingController;
    private TicketController ticketController;
    private User currentUser;

    public App() {
        this.scanner = new Scanner(System.in);
        this.currentUser = new User(1, "João Silva", "joao", "joao@email.com", "123456", 25);
        
        MovieRepository movieRepository = new MovieRepository();
        MovieView movieView = new MovieView();
        this.movieController = new MovieController(movieRepository, movieView);
        
        ShowingRepository showingRepository = new ShowingRepository();
        ShowingView showingView = new ShowingView();
        this.showingController = new ShowingController(showingView);
        
        TicketRepository ticketRepository = new TicketRepository();
        TicketView ticketView = new TicketView();
        this.ticketController = new TicketController(ticketRepository, ticketView);
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
                    Movie selectedMovie = movieController.listMovies();
                    if (selectedMovie != null) {
                        Showing selectedShowing = showingController.selectShowing(selectedMovie);
                        if (selectedShowing != null) {
                            ticketController.purchaseTicket(selectedShowing, currentUser);
                        }
                    }
                    break;
                case 2:
                    ticketController.listUserTickets(currentUser);
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