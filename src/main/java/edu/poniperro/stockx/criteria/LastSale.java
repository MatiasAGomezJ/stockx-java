package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;

import java.util.ArrayList;
import java.util.List;

public class LastSale implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> llastSale = new ArrayList<>();
        Offer lastSale = item.offers().get(item.offers().size()-1);
        llastSale.add(lastSale);
        return llastSale;
    }
}
