package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
