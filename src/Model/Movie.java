package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import Model.Showing;
public class Movie {
    private int movieId;
    private String title;
    private LocalDate releaseDate;
    private int durationMinutes;
    private int distributorId;
    private int genreId;
    private List<Showing> showings;

    public Movie() {
        this.showings = new ArrayList<>();
    }

    public Movie(int movieId, String title, LocalDate releaseDate, int durationMinutes, int distributorId, int genreId) {
        this.movieId = movieId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.durationMinutes = durationMinutes;
        this.distributorId = distributorId;
        this.genreId = genreId;
        this.showings = new ArrayList<>();
    }

    public int getMovieId() { return movieId; }
    public void setMovieId(int movieId) { this.movieId = movieId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getReleaseDate() { return releaseDate; }
    public void setReleaseDate(LocalDate releaseDate) { this.releaseDate = releaseDate; }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    public int getDistributorId() { return distributorId; }
    public void setDistributorId(int distributorId) { this.distributorId = distributorId; }

    public int getGenreId() { return genreId; }
    public void setGenreId(int genreId) { this.genreId = genreId; }

    public List<Showing> getShowings() { return showings; }
    public void setShowings(List<Showing> showings) { this.showings = showings; }
}