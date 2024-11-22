package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
    Shape s = new Shape();

    public double calcPerimeter(double height, double width) {
        s.setType(1);
        s.setHeight(height);
        s.setWidth(width);
        return s.getHeight() * 2 + s.getWidth() * 2;
    }

    public double calcArea(double height, double width) {
        s.setType(1);
        s.setHeight(height);
        s.setWidth(width);
        return s.getHeight() * s.getWidth();
    }

    public void paintColor(String color) {
        s.setColor(color);
    }

    public String print() {
        s.setType(1);
        return s.information();
    }
}
