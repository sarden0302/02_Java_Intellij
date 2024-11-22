package com.kh.oop.constructor;

public class Snack {

    private String type;
    private int price;
    private String flavor;

    public Snack() {}

    public Snack(String type, int price, String flavor) {
        this.type = type;
        this.price = price;
        this.flavor = flavor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "[" + type + ", " + price + ", " + flavor + "]";
    }
}
