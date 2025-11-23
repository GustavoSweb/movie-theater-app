package Model;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class Ticket {

    private int id;
    private int userId;
    private int showingId;
    private String seatNumber;
    private String cinemaName;
    private LocalDateTime sessionDate;
    private BigDecimal price;

    public Ticket() {}

    public Ticket(int id, int userId, int showingId, String seatNumber) {
        this.id = id;
        this.userId = userId;
        this.showingId = showingId;
        this.seatNumber = seatNumber;
    }

    public Ticket(int id, String title, String cinemaName, LocalDateTime sessionDate,
                  String seatNumber, BigDecimal price) {
        this.id = id;
        this.cinemaName = cinemaName;
        this.sessionDate = sessionDate;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getShowingId() {
        return showingId;
    }

    public void setShowingId(int showingId) {
        this.showingId = showingId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public LocalDateTime getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDateTime sessionDate) {
        this.sessionDate = sessionDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println(" TICKET ");
        System.out.println("ID: " + getId());
        System.out.println("Cinema: " + getCinemaName());
        System.out.println("Data da Sessão: " + getSessionDate());
        System.out.println("Assento: " + getSeatNumber());
        System.out.println("Preço: R$ " + getPrice());
    }
}