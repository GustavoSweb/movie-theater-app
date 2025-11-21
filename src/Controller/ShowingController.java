package Controller;

import Model.Movie;
import Model.Showing;
import View.ShowingView;

public class ShowingController {
    private ShowingView showingView;

    public ShowingController(ShowingView showingView) {
        this.showingView = showingView;
    }

    public Showing selectShowing(Movie movie) {
        int selectedIndex;
        do {
            selectedIndex = showingView.displayShowings(movie);
            
            if (selectedIndex == 0) {
                return null;
            } else if (selectedIndex >= 1 && selectedIndex <= movie.getShowings().size()) {
                return movie.getShowings().get(selectedIndex - 1);
            } else {
                System.out.println("Índice inválido! Tente novamente.");
            }
        } while (true);
    }
}