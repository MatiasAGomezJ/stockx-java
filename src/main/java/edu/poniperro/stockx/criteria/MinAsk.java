package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;

import java.util.ArrayList;
import java.util.List;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        Offer minAsk = item.offers().get(0);

        for (Offer o : item.offers()) {
            if (o instanceof Ask) {
                if (o.value() < minAsk.value()) {
                    minAsk = o;
                }
            }
        }

        List<Offer> lminAsk = new ArrayList<>();
        lminAsk.add(minAsk);
        return lminAsk;
    }
}
