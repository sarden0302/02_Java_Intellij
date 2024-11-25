package com.kh.oopEx;

import lombok.Getter;
import lombok.Setter;

public class People {
    //
    private String name;
    private int jumin;
    private int phone;
    @Setter @Getter
    private String hobby;
    @Setter @Getter
    private String speciality;

    public People() {
    }

    public People(String name, int jumin, int phone) {
        this.name = name;
        this.jumin = jumin;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "People[" + "name=" + name + ", jumin=" + jumin + ", phone=" + phone + ", hobby=" + hobby + ", speciality=" + speciality + ']';
    }
}
