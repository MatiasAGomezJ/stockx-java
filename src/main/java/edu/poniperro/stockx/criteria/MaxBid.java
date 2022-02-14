package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;

import java.util.ArrayList;
import java.util.List;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        Offer maxBid = item.offers().get(0);

        for (Offer o : item.offers()) {
            if (o instanceof Bid) {
                if (o.value() > maxBid.value()) {
                    maxBid = o;
                }
            }
        }

        List<Offer> lmaxBid = new ArrayList<>();
        lmaxBid.add(maxBid);
        return lmaxBid;
    }
}
