package edu.poniperro.stockx.offer;

public class Ask implements Offer {

    private String size;
    private Integer ask;

    public Ask(String size, int ask){
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int value() {
        return ask;
    }

    @Override
    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t\t" + this.value() +"\n";
    }
}
