package com.kh.oop.methodPre;

import java.util.Scanner;

public class PersonPreRun {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PersonPre p = new PersonPre();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (name.isEmpty()) {
            System.out.println("빈칸은 이름으로 들어갈 수 없습니다.");
            return;
        } else {
            p.setName(name);
        }
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());


        if (age <= 0) {
            System.out.println("나이는 음수일 수 없습니다.");
            return;
        } else {
            p.setAge(age);
        }

        System.out.println("Your name is " + p.getName() + "\nYour age is " + p.getAge());
    }
}
