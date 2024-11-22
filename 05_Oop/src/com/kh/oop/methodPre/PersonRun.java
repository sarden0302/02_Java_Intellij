package com.kh.oop.methodPre;

import com.kh.oop.methodex.Person;

public class PersonRun {
    public static void main(String[] args) {
        Person p = new Person();

        int inputAge = -40;

        if (inputAge < 0) {
            System.out.println("나이가 음수일 수 없습니다.");
        } else {
            p.setAge(inputAge);
        }

        if (p.getAge() <= 0) {
            System.out.println("저장된 값이 없습니다.");
        } else {
            System.out.println("Age is " + p.getAge());
        }
    }
}
