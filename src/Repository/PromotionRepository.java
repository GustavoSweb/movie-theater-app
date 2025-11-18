package Repository;


import Model.Promotion;

import java.util.ArrayList;
import java.util.List;

public class PromotionRepository {

    private List<Promotion> promotions = new ArrayList<>();

    public void add(Promotion films) {
        promotions.add(films);
    }

    public List<Promotion> list() {
        return promotions;
    }
}
