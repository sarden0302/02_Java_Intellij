package com.kh.oopEx;

public class Bread {
    private String breadName;
    private int breadPrice;
    private int quantity;

    public Bread() {

    }

    public Bread(String breadName, int breadPrice, int quantity) {
        this.breadName = breadName;
        this.breadPrice = breadPrice;
        this.quantity = quantity;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public int getBreadPrice() {
        return breadPrice;
    }

    public void setBreadPrice(int breadPrice) {
        this.breadPrice = breadPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bread [breadName=" + breadName + ", breadPrice=" + breadPrice + "]";
    }
}
