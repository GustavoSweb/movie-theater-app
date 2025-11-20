package Repository;

import Model.Movie;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public MovieRepository() {
        loadDefaultMovies();
    }

    private void loadDefaultMovies() {
        movies.add(new Movie(1, "Vingadores: Ultimato", LocalDate.of(2019, 4, 26), 181, 1, 1));
        movies.add(new Movie(2, "Parasita", LocalDate.of(2019, 5, 30), 132, 2, 2));
        movies.add(new Movie(3, "Coringa", LocalDate.of(2019, 10, 4), 122, 3, 2));
    }

    public void add(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> list() {
        return movies;
    }
}
