package Controller;

import Model.Showing;
import Model.User;
import Model.Ticket;
import Repository.TicketRepository;
import View.TicketView;
import java.util.List;
import java.util.ArrayList;

public class TicketController {
    private TicketRepository ticketRepository;
    private TicketView ticketView;

    public TicketController(TicketRepository ticketRepository, TicketView ticketView) {
        this.ticketRepository = ticketRepository;
        this.ticketView = ticketView;
    }

    public void purchaseTicket(Showing showing, User user) {
        boolean isPurchased = ticketView.displayTicketInfo(showing);
        if (isPurchased) {
            List<String> availableSeats = showing.getAvailableSeatNumbers();
            String seat = availableSeats.get(0);
            
            int ticketId = ticketRepository.list().size() + 1;
            Ticket ticket = new Ticket(ticketId, user.getId(), showing.getId(), seat);
            ticketRepository.add(ticket);
            showing.getPurchasedTickets().add(ticket);
            System.out.println("Ticket comprado com sucesso! Assento: " + seat);
        }
    }

    public void listUserTickets(User user) {
        List<Ticket> userTickets = ticketRepository.findByUserId(user.getId());
        ticketView.displayPurchasedTickets(userTickets);
    }
}