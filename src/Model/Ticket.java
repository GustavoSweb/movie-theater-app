package Model;

import java.time.LocalDateTime;

public class Ticket extends CinemaItem {

    private String cinemaName;
    private LocalDateTime sessionDate;
    private int seatNumber;
    private double price;

    public Ticket() {}

    public Ticket(int id, String title, String cinemaName, LocalDateTime sessionDate,
                  int seatNumber, double price) {

        super(id, title);
        this.cinemaName = cinemaName;
        this.sessionDate = sessionDate;
        this.seatNumber = seatNumber;
        this.price = price;
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

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayInfo() {
        System.out.println(" TICKET ");
        System.out.println("ID: " + getId());
        System.out.println("Filme: " + getTitle());
        System.out.println("Cinema: " + getCinemaName());
        System.out.println("Data da Sessão: " + getCinemaName());
        System.out.println("Assento: " + getSeatNumber());
        System.out.println("Preço: R$ " + getPrice());
    }
}
