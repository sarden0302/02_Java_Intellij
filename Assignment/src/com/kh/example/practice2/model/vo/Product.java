package com.kh.example.practice2.model.vo;

public class Product {
    public String pName;
    public int price;
    public String brand;

    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void information() {
        System.out.println("이름은 " + this.pName + "이고 가격은 $" + this.price + "이고 브랜드는 " + this.brand + "입니다");
    }
}
