package Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import Model.Movie;
import Model.Ticket;

public class Showing {
    private int showingId;
    private int movieId;
    private int hallId;
    private LocalDate showDate;
    private LocalTime showTime;
    private BigDecimal price;
    private Movie movie;
    private int availableTickets;
    private List<Ticket> tickets;

    public Showing() {
        this.tickets = new ArrayList<>();
    }

    public Showing(int showingId, int movieId, int hallId, LocalDate showDate, LocalTime showTime, BigDecimal price, Movie movie, int availableTickets) {
        this.showingId = showingId;
        this.movieId = movieId;
        this.hallId = hallId;
        this.showDate = showDate;
        this.showTime = showTime;
        this.price = price;
        this.movie = movie;
        this.availableTickets = availableTickets;
        this.tickets = new ArrayList<>();
    }

    public int getShowingId() { return showingId; }
    public void setShowingId(int showingId) { this.showingId = showingId; }

    public int getMovieId() { return movieId; }
    public void setMovieId(int movieId) { this.movieId = movieId; }

    public int getHallId() { return hallId; }
    public void setHallId(int hallId) { this.hallId = hallId; }

    public LocalDate getShowDate() { return showDate; }
    public void setShowDate(LocalDate showDate) { this.showDate = showDate; }

    public LocalTime getShowTime() { return showTime; }
    public void setShowTime(LocalTime showTime) { this.showTime = showTime; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }

    public int getAvailableTickets() { return availableTickets; }
    public void setAvailableTickets(int availableTickets) { this.availableTickets = availableTickets; }

    public List<Ticket> getTickets() { return tickets; }
    public void setTickets(List<Ticket> tickets) { this.tickets = tickets; }
}