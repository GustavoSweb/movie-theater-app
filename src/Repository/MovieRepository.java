package Repository;

import Model.Movie;
import Model.Showing;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import Model.Ticket;
public class MovieRepository {

    private List<Movie> movies = new ArrayList<>();

    public MovieRepository() {
        loadDefaultMovies();
    }

    private void loadDefaultMovies() {
        Movie movie1 = new Movie(1, "Vingadores: Ultimato", LocalDate.of(2019, 4, 26), 181, 1, 1);
        Showing showing1 = new Showing(1, 1, 1, LocalDate.now(), LocalTime.of(14, 30), new BigDecimal("25.00"), movie1, 48);
        showing1.getTickets().add(new Ticket(1, 1, 1, "A1", LocalDate.now().minusDays(1)));
        showing1.getTickets().add(new Ticket(2, 1, 2, "A2", LocalDate.now().minusDays(1)));
        movie1.getShowings().add(showing1);
        
        Showing showing2 = new Showing(2, 1, 2, LocalDate.now(), LocalTime.of(19, 00), new BigDecimal("30.00"), movie1, 50);
        movie1.getShowings().add(showing2);
        
        Movie movie2 = new Movie(2, "Parasita", LocalDate.of(2019, 5, 30), 132, 2, 2);
        Showing showing3 = new Showing(3, 2, 1, LocalDate.now().plusDays(1), LocalTime.of(16, 00), new BigDecimal("22.00"), movie2, 45);
        showing3.getTickets().add(new Ticket(3, 3, 3, "B5", LocalDate.now()));
        movie2.getShowings().add(showing3);
        
        Movie movie3 = new Movie(3, "Coringa", LocalDate.of(2019, 10, 4), 122, 3, 2);
        movie3.getShowings().add(new Showing(4, 3, 3, LocalDate.now(), LocalTime.of(21, 30), new BigDecimal("28.00"), movie3, 0));
        movie3.getShowings().add(new Showing(5, 3, 1, LocalDate.now().plusDays(2), LocalTime.of(15, 00), new BigDecimal("25.00"), movie3, 30));
        
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
    }

    public void add(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> list() {
        return movies;
    }
}
