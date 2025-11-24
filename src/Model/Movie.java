package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Model.Showing;
public class Movie {

    private int id;
    private String title;
    private LocalDate releaseDate;
    private int durationMinutes;
    private int distributorId;
    private String genre;
    private List<Showing> showings;

    public Movie() {}

    public Movie(int id, String title, LocalDate releaseDate, int durationMinutes, int distributorId, String genre) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.durationMinutes = durationMinutes;
        this.distributorId = distributorId;
        this.genre = genre;
        this.showings = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Showing> getShowings() {
        return showings;
    }

    public void setShowings(List<Showing> showings) {
        this.showings = showings;
    }

    public void addShowing(Showing showing) {
        this.showings.add(showing);
    }
}