package edu.poniperro.stockx.item;

import edu.poniperro.stockx.offer.Offer;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{

    private String style;
    private String name;
    private int bid;
    private int ask;
    private int sale;

    private List<Offer> offers = new ArrayList<>();

    public Sneaker(String style, String name) {
       this.style = style;
       this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getBid() {
        return bid;
    }

    @Override
    public int getAsk() {
        return ask;
    }

    @Override
    public int getSale() {
        return sale;
    }

    @Override
    public void add(Offer offer) {
        offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return offers;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return name + "\n\t\t" + style;
    }
}
