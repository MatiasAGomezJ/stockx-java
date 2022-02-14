package edu.poniperro.stockx.criteria;

import edu.poniperro.stockx.item.*;
import edu.poniperro.stockx.offer.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AndCriteriaTest {

    @BeforeEach
    public void preparingStuff() {
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");

        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));

        Ask ask = new Ask("13", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));

        Sale sale = new Sale("6", 356);
        sneaker.add(sale);
        sneaker.add(new Sale("9.5", 352));
        sneaker.add(new Sale("9.5", 404));
        sneaker.add(new Sale("13", 360));
        sneaker.add(new Sale("13", 372));
    }

    @Test
    public void andCriteriaOfferInstanceTest() {
        Criteria size = new Size("9.5");
        Criteria sales = new Sales();
        Criteria andSizeSales = new AndCriteria(size, sales);

        List<Offer> sizeSales = andSizeSales.checkCriteria(sneaker);
        sneaker.setSale(sizeSales.isEmpty()?
                0 :
                sizeSales.get(sizeSales.size() -1).value());
        for (Offer o: sizeSales){
            System.out.println(o.getClass());;
        }
    }

}
