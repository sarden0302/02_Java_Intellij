package com.kh.example.practice3.model.vo;

public class Circle {
    public final double PI = 3.14;
    public int radius = 1;

    public Circle() {
        double PI = 3.14;
        int radius = 1;
    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void incrementRadius() {
        this.radius++;
    }

    public void getAreaOfCircle() {
        System.out.println("원의 둘레는 " + (this.PI * radius * 2) + "입니다.");
    }

    public void getSizeOfCircle() {
        System.out.println("원의 넓이는 " + (this.PI * radius * radius) + "입니다.");
    }
}
