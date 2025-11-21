package Model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import model.CinemaItem;

public class Showing extends CinemaItem {

    private int movieId;
    private int hallId;
    private LocalDate showDate;
    private LocalTime showTime;
    private BigDecimal price;

    public Showing() {}

    public Showing(int id, int movieId, int hallId,
                   LocalDate showDate, LocalTime showTime, BigDecimal price) {

        super(id, "Sessão " + id);
        this.movieId = movieId;
        this.hallId = hallId;
        this.showDate = showDate;
        this.showTime = showTime;
        this.price = price;
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

    @Override
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