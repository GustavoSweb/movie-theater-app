package View;

import java.util.Scanner;
import Model.Showing;

public class TicketView {
    private Scanner scanner;

    public TicketView() {
        this.scanner = new Scanner(System.in);
    }

    public boolean displayTicketInfo(Showing showing) {
        System.out.println("=== Informações da Sessão " + showing.getShowingId() + " ===");
        System.out.println("Filme: " + showing.getMovie().getTitle());
        System.out.println("Data: " + showing.getShowDate() + " às " + showing.getShowTime());
        System.out.println("Preço: R$ " + showing.getPrice());
        
        int totalTickets = showing.getTickets().size() + showing.getAvailableTickets();
        int soldTickets = showing.getTickets().size();
        
        System.out.println("Total de ingressos: " + totalTickets);
        System.out.println("Ingressos vendidos: " + soldTickets);
        System.out.println("Ingressos disponíveis: " + showing.getAvailableTickets());
        
        if (showing.getAvailableTickets() > 0) {
            System.out.print("\nDeseja comprar um ingresso? (S/N): ");
            String response = scanner.nextLine().toUpperCase();
            return response.equals("S");
        } else {
            System.out.println("\nSessão esgotada!");
            return false;
        }
    }
}