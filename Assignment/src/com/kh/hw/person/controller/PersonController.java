package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
    private Student[] s = new Student[3];
    private Employee[] e = new Employee[10];

    public int[] personCount() {
        int[] result = {0, 0};
        for (Student s : s) {
            if (s != null) {
                result[0]++;
            }
        }

        for (Employee e : e) {
            if (e != null) {
                result[1]++;
            }
        }

        return result;
    }

    public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

    }

    public Student[] printStudent() {
        return new Student[0];
    }

    public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

    }

    public Employee[] printEMployee() {
        return e;
    }

}
