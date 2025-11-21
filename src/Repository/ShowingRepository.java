package Repository;

import Model.Showing;
import java.util.ArrayList;
import java.util.List;

public class ShowingRepository {

    private List<Showing> showings = new ArrayList<>();

    public void add(Showing showing) {
        showings.add(showing);
    }

    public List<Showing> list() {
        return showings;
    }
}