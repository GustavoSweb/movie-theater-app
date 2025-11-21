package Model;

import java.time.LocalDate;

public class Movie extends CinemaItem {

    private LocalDate releaseDate;
    private int durationMinutes;
    private int distributorId;
    private int genreId;

    public Movie() {}

    public Movie(int id, String title, LocalDate releaseDate, int durationMinutes, int distributorId, int genreId) {
        super(id, title);
        this.releaseDate = releaseDate;
        this.durationMinutes = durationMinutes;
        this.distributorId = distributorId;
        this.genreId = genreId;
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

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }


    @Override
    public void displayInfo() {
        System.out.println(" FILME ");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitle());
        System.out.println("Lançamento: " + releaseDate);
        System.out.println("Duração: " + durationMinutes + " minutos");
        System.out.println("Gênero (ID): " + genreId);
        System.out.println("Distribuidora (ID): " + distributorId);
    }
}
