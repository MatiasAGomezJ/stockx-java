package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = criteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteria = criteria.checkCriteria(item);
        List<Offer> secondCriteria = otherCriteria.checkCriteria(item);

        List<Offer> mix = new ArrayList<>();

        for (Offer o : firstCriteria){
            if (secondCriteria.contains(o)) {
                mix.add(o);
            }
        }
        return mix;
    }
}
