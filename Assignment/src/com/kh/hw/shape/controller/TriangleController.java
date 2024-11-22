package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
    Shape s = new Shape();

    public double calcPerimeter(double height, double width) {
        s.setType(0);
        s.setHeight(height);
        s.setWidth(width);
        return Math.sqrt(s.getHeight() * s.getHeight() +  s.getWidth() * s.getWidth());
    }

    public double calcArea(double height, double width) {
        s.setType(0);
        s.setHeight(height);
        s.setWidth(width);
        return s.getHeight() * s.getWidth() / 2;
    }

    public void paintColor(String color) {
        s.setColor(color);
    }

    public String print() {
        s.setType(0);
        return s.information();
    }
}
