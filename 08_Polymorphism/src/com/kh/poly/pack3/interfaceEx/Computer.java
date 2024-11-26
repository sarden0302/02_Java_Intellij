package com.kh.poly.pack3.interfaceEx;

// interface 상속하는 키워드 : implements
public class Computer implements Machine {

    @Override
    public void powerOn() {
        System.out.println("Computer powered on");
    }

    @Override
    public void powerOff() {
        System.out.println("Computer powered off");
    }
}
