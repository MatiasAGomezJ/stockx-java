package edu.poniperro.stockx.offer;

public class Bid implements Offer {

    private String size;
    private Integer bid;

    public Bid(String size, int bid){
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int value() {
        return bid;
    }

    @Override
    public int compareTo(Offer bid) {
        return this.bid.compareTo(bid.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t\t" + this.value() +"\n";
    }
}
