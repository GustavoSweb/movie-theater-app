package Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import Model.Movie;
import Model.Ticket;
public class Showing {

    private int id;
    private int movieId;
    private Movie movie;
    private int hallId;
    private LocalDate showDate;
    private LocalTime showTime;
    private BigDecimal price;
    private ArrayList<Ticket> purchasedTickets;
    private int tickets;

    public Showing() {}

    public Showing(int id, int movieId, int hallId,
                   LocalDate showDate, LocalTime showTime, BigDecimal price) {
        this.id = id;
        this.movieId = movieId;
        this.hallId = hallId;
        this.showDate = showDate;
        this.showTime = showTime;
        this.price = price;
    }

    public Showing(int id, Movie movie, int hallId,
                   LocalDate showDate, LocalTime showTime, BigDecimal price) {
        this.id = id;
        this.movie = movie;
        this.movieId = movie.getId();
        this.hallId = hallId;
        this.showDate = showDate;
        this.showTime = showTime;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalTime showTime) {
        this.showTime = showTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
        this.movieId = movie != null ? movie.getId() : 0;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public ArrayList<Ticket> getPurchasedTickets() {
        return purchasedTickets;
    }

    public void setPurchasedTickets(ArrayList<Ticket> purchasedTickets) {
        this.purchasedTickets = purchasedTickets;
    }

    public int getAvailableTickets() {
        if (purchasedTickets == null) {
            return tickets;
        }
        return tickets - purchasedTickets.size();
    }

    public List<String> getAvailableSeatNumbers() {
        Set<String> occupiedSeats = new HashSet<>();
        if (purchasedTickets != null) {
            for (Ticket ticket : purchasedTickets) {
                occupiedSeats.add(ticket.getSeatNumber());
            }
        }
        
        char seatLetter = (char) ('A' + (id - 1) % 26);
        List<String> availableSeats = new ArrayList<>();
        for (int i = 1; i <= tickets; i++) {
            String seat = seatLetter + String.valueOf(i);
            if (!occupiedSeats.contains(seat)) {
                availableSeats.add(seat);
            }
        }
        return availableSeats;
    }

    public void displayInfo() {
        System.out.println(" SESSÃO ");
        System.out.println("ID Sessão: " + getId());
        System.out.println("Filme (ID): " + getMovieId());
        System.out.println("Sala: " + getHallId());
        System.out.println("Data: " + getShowDate());
        System.out.println("Horário: " + getShowTime());
        System.out.println("Preço: R$ " + getPrice());
    }
}