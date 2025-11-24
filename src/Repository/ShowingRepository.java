package Repository;

import Model.Showing;
import Repository.BaseRepository;

public class ShowingRepository extends BaseRepository<Showing> {

    public ShowingRepository() {
        super("showings.txt");
    }

    @Override
    public Showing findById(int id) {
        return items.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}