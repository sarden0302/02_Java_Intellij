package com.kh.practice.point.model.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
    private Circle c = new Circle();

    public String calcArea(int x, int y, int radius) {
        c = new Circle(x, y, radius);
        return String.valueOf(c.getRadius() * c.getRadius() * Math.PI);
    }

    public String calcCircum(int x, int y, int radius) {
        c = new Circle(x, y, radius);
        return String.valueOf(c.getRadius() * 2 * Math.PI);
    }
}
