package com.kh.example.practice6.model.vo;

public class Book {
    public String title;
    public String publisher;
    public String author;
    public int price;
    public double discountRate;

    public Book() {

    }

    public Book(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public Book(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void inform() {
        System.out.println("Title: " + title + ", Publisher: " + publisher + ", Author: " + author + ", Price: " + price + ", DiscountRate: " + discountRate);
    }

}
