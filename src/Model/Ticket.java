package Model;

import Util.Validator;
import java.time.LocalDateTime;

public class Ticket {

    private int id;
    private String movieTheater;
    private String titleMovie;
    private String genres;
    private LocalDateTime dateMovie;
    private int durationMovie;
    private int numberSessionMovie;
    private int numberSeatMovie;
    private int numberTicket;
    private double priceMovie;

    public Ticket() {}

    public Ticket(int id, String movieTheater, String titleMovie, String genres,
                  LocalDateTime dateMovie, int durationMovie, int numberSessionMovie,
                  int numberSeatMovie, int numberTicket, double priceMovie) {

        this.id = id;
        this.movieTheater = movieTheater;
        this.titleMovie = titleMovie;
        this.genres = genres;
        this.dateMovie = dateMovie;
        this.durationMovie = durationMovie;

        setNumberSessionMovie(numberSessionMovie);
        setPriceMovie(priceMovie);

        this.numberSeatMovie = numberSeatMovie;
        this.numberTicket = numberTicket;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMovieTheater() { return movieTheater; }
    public void setMovieTheater(String movieTheater) { this.movieTheater = movieTheater; }

    public String getTitleMovie() { return titleMovie; }
    public void setTitleMovie(String titleMovie) { this.titleMovie = titleMovie; }

    public String getGenres() { return genres; }
    public void setGenres(String genres) { this.genres = genres; }

    public LocalDateTime getDateMovie() { return dateMovie; }
    public void setDateMovie(LocalDateTime dateMovie) { this.dateMovie = dateMovie; }

    public int getDurationMovie() { return durationMovie; }
    public void setDurationMovie(int durationMovie) { this.durationMovie = durationMovie; }

    public int getNumberSessionMovie() { return numberSessionMovie; }

    public void setNumberSessionMovie(int numberSessionMovie) {
        Validator.validarSessao(numberSessionMovie);
        this.numberSessionMovie = numberSessionMovie;
    }

    public int getNumberSeatMovie() { return numberSeatMovie; }
    public void setNumberSeatMovie(int numberSeatMovie) { this.numberSeatMovie = numberSeatMovie; }

    public int getNumberTicket() { return numberTicket; }
    public void setNumberTicket(int numberTicket) { this.numberTicket = numberTicket; }

    public double getPriceMovie() { return priceMovie; }

    public void setPriceMovie(double priceMovie) {
        Validator.validarPreco(priceMovie);
        this.priceMovie = priceMovie;
    }

    public void exibirTicket() {
        System.out.println("Ticket ID: " + this.id);
        System.out.println("Cinema: " + this.movieTheater);
        System.out.println("Titulo do filme: " + this.titleMovie);
        System.out.println("Gêneros: " + this.genres);
        System.out.println("Data da sessão: " + this.dateMovie);
        System.out.println("Duração do filme: " + this.durationMovie);
        System.out.println("Número da sessão: " + this.numberSessionMovie);
        System.out.println("Número do assento: " + this.numberSeatMovie);
        System.out.println("Número do Ticket: " + this.numberTicket);
        System.out.println("Preço do ticket: " + this.priceMovie);
        System.out.println("------------------------------------");
        System.out.println("Obrigado pela preferência, tenha um bom filme e se divirta😊🍿");
        System.out.println("------------------------------------");
    }
}
