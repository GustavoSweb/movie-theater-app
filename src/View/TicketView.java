package View;

import java.util.Scanner;
import java.util.List;
import Model.Showing;
import Model.Ticket;

public class TicketView {
    private Scanner scanner;

    public TicketView() {
        this.scanner = new Scanner(System.in);
    }

    public boolean displayTicketInfo(Showing showing) {
        System.out.println("=== Informações da Sessão " + showing.getId() + " ===");
        System.out.println("Filme: " + showing.getMovie().getTitle());
        System.out.println("Data: " + showing.getShowDate() + " às " + showing.getShowTime());
        System.out.println("Preço: R$ " + showing.getPrice());
        
        int totalTickets = showing.getTickets();
        int soldTickets = showing.getPurchasedTickets().size();

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

    public void displayPurchasedTickets(List<Ticket> tickets) {
        System.out.println("=== Ingressos Comprados ===");
        if (tickets.isEmpty()) {
            System.out.println("Nenhum ingresso comprado ainda.");
        } else {
            for (Ticket ticket : tickets) {
                System.out.println("ID: " + ticket.getId() + " | Sessão: " + ticket.getShowingId() + " | Assento: " + ticket.getSeatNumber());
            }
        }
    }
}