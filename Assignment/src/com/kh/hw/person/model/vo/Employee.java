package com.kh.hw.person.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee extends Person {
    private int salary;
    private String dept;

    @Override
    public String toString() {
        return super.toString() +
                "salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
