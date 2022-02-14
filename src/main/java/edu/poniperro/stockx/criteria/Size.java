package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;

import java.util.ArrayList;
import java.util.List;

public class Size implements Criteria{

    private String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> sameSize = new ArrayList<>();

        for (Offer o : item.offers()){
            if (o.size() == this.size) {
                sameSize.add(o);
            }
        }
        return sameSize;
    }
}
