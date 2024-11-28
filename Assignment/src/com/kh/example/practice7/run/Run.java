package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;
public class Run {
    public static void main(String[] args) {
        // 생성자에 모든 값 초기화
        Employee emp = new Employee(100, "홍길동", "영업부", "과장", 25, '남', 2500000, 0.05, "010-1234-5678", "서울시 강남구");
        System.out.println(emp.toString());

        //using Getter && Setter
        Employee emp2 = new Employee();
        emp2.setEmpNo(100);

        System.out.println(emp2.getEmpNo());

    }
}
