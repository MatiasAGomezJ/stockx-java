package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;

import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                .stream()
                .filter(o -> o instanceof Ask)
                .collect(Collectors.toList());
    }
}
