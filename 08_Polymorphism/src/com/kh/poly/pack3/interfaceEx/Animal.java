package com.kh.poly.pack3.interfaceEx;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Animal {
    private String type;

    public Animal(){};
    public Animal(String type){
        this.type = type;
    }

    public abstract void eat();
    public abstract void sleep();

    @Override
    public String toString(){
        return type;
    }
}
