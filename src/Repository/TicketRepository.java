package Repository;

import Model.Ticket;
import java.util.ArrayList;
import java.util.List;
import Repository.BaseRepository;

public class TicketRepository extends BaseRepository<Ticket> {

    @Override
    public Ticket findById(int id) {
        return items.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    public List<Ticket> findByUserId(int userId) {
        List<Ticket> userTickets = new ArrayList<>();
        for (Ticket ticket : items) {
            if (ticket.getUserId() == userId) {
                userTickets.add(ticket);
            }
        }
        return userTickets;
    }
}