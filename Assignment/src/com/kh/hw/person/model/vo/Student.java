package com.kh.hw.person.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student extends Person {
    private int grade;
    private String major;

    @Override
    public String toString() {
        return  super.toString() +
                "grade=" + grade +
                ", major='" + major + '\'' +
                '}';
    }
}
