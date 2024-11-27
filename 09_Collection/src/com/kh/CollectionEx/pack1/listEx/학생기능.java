package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class 학생기능 {
    private ArrayList<학생> std1 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    // 1. 학생을 추가하는 addStudent() {} 기능 설정
    public void addStudent() {
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("학년을 입력하세요 : ");
        int grade = Integer.parseInt(sc.nextLine());
        System.out.print("취미를 입력하세요 : ");
        String hobby = sc.nextLine();

        학생 student = new 학생(name, grade, hobby);
        학생 student2 = new 학생("홍길동", 10, "공부하기");
        학생 student3 = new 학생("박철수", 20, "친구만나기");

        std1.add(student);
        std1.add(student2);
        std1.add(student3);

        for (학생 s : std1) {
            System.out.println(s);
        }
    }

    public void removeStudent() {
        if (std1.isEmpty()) {
            System.out.println("다들 졸업함");
            return;
        }
        System.out.print("학생 이름을 입력하세요 : ");
        String name = sc.nextLine();

        for (학생 s : std1) {
            if (s.get이름().equals(name)) {
                std1.remove(s);
                System.out.println(name + " 학생은 퇴학당했습니다");
                return;
            }
        }
        System.out.println("일치하는 학생은 없습니다.");
    }

    @Override
    public String toString() {
        return std1.toString();
    }

    // <학생> 타입으로 ArrayList 생성 변수명 std1
}
