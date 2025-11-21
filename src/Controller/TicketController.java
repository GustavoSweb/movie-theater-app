package Controller;

import Model.Showing;
import View.TicketView;

public class TicketController {
    private TicketView ticketView;

    public TicketController(TicketView ticketView) {
        this.ticketView = ticketView;
    }

    public boolean checkTicketAvailability(Showing showing) {
        return ticketView.displayTicketInfo(showing);
    }
}