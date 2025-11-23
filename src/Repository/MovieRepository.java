package Repository;

import Model.Movie;
import Model.Showing;
import Model.Ticket;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import Repository.BaseRepository;
public class MovieRepository extends BaseRepository<Movie> {

    public MovieRepository() {
        loadDefaultMovies();
    }

    private void loadDefaultMovies() {
        Movie movie1 = new Movie(1, "Vingadores: Ultimato", LocalDate.of(2019, 4, 26), 181, 1, "Ação");
        Movie movie2 = new Movie(2, "Parasita", LocalDate.of(2019, 5, 30), 132, 2, "Drama");
        Movie movie3 = new Movie(3, "Coringa", LocalDate.of(2019, 10, 4), 122, 3, "Drama");
        
        // Sessões para Vingadores
        Showing showing1 = new Showing(1, movie1, 1, LocalDate.now().plusDays(1), LocalTime.of(14, 30), new BigDecimal("25.00"));
        showing1.setTickets(100);
        showing1.setPurchasedTickets(new ArrayList<>());
        movie1.addShowing(showing1);
        
        Showing showing2 = new Showing(2, movie1, 2, LocalDate.now().plusDays(1), LocalTime.of(19, 00), new BigDecimal("30.00"));
        showing2.setTickets(150);
        ArrayList<Ticket> tickets2 = new ArrayList<>();
        tickets2.add(new Ticket(1, 1, 1, "A1"));
        tickets2.add(new Ticket(2, 1, 1, "A2"));
        showing2.setPurchasedTickets(tickets2);
        movie1.addShowing(showing2);
        
        // Sessão para Parasita
        Showing showing3 = new Showing(3, movie2, 1, LocalDate.now().plusDays(2), LocalTime.of(16, 00), new BigDecimal("22.00"));
        showing3.setTickets(80);
        ArrayList<Ticket> tickets3 = new ArrayList<>();
        tickets3.add(new Ticket(3, 2, 1, "B5"));
        showing3.setPurchasedTickets(tickets3);
        movie2.addShowing(showing3);
        
        items.add(movie1);
        items.add(movie2);
        items.add(movie3);
    }

    @Override
    public Movie findById(int id) {
        return items.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }
}
