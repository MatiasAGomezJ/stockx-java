package edu.poniperro.stockx.offer;

public class Sale implements Offer {

    private String size;
    private Integer sale;

    public Sale(String size, int sale){
        this.size = size;
        this.sale = sale;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int value() {
        return sale;
    }

    @Override
    public int compareTo(Offer sale) {
        return this.sale.compareTo(sale.value());
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t\t" + this.value() +"\n";
    }
}
