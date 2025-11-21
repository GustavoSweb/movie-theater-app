package Model;

import java.time.LocalDate;

public class Movie extends CinemaItem {

    private LocalDate releaseDate;
    private int durationMinutes;
    private int distributorId;
    private String genre;

    public Movie() {}

    public Movie(int id, String title, LocalDate releaseDate, int durationMinutes, int distributorId, String genre) {
        super(id, title);
        this.releaseDate = releaseDate;
        this.durationMinutes = durationMinutes;
        this.distributorId = distributorId;
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(int distributorId) {
        this.distributorId = distributorId;
    }

    public String getGenre() {
        return genreId;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public void displayInfo() {
        System.out.println(" FILME ");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitle());
        System.out.println("Lançamento: " + getReleaseDate());
        System.out.println("Duração: " + getDurationMinutes() + " minutos");
        System.out.println("Gênero : " + getGenre());
        System.out.println("Distribuidora (ID): " + getDistributorId());
    }
}
