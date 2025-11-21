package Repository;

import Model.Ticket;
import java.util.ArrayList;
import java.util.List;

public class TicketRepository {

    private List<Ticket> tickets = new ArrayList<>();

    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> list() {
        return tickets;
    }
}