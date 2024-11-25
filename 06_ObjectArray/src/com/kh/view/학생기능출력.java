package com.kh.view;

import com.kh.dto.학생;
import com.kh.service.학생서비스;

import java.util.Scanner;

// 사용자가 정보를 입력하고, 입력된 정보를 출력하는 클래스
// 추후 frontend를 연결하면 view package는 사라지고
// HTML에 연결해서 이쁜 화면으로 입출력 정보를 보여줄 예정
public class 학생기능출력 {
    // 필드
    private Scanner sc = new Scanner(System.in);

    private 학생서비스 service = new 학생서비스();

    // 기능
    // 학생에 입력된 학번 이름 성별을 한번에 전달
    public 학생 inputStudent() {
        System.out.print("학번을 입력하세요 : ");
        String studentNumber = sc.nextLine();

        System.out.print("이름을 입력하세요 : ");
        String studentName = sc.nextLine();

        System.out.print("성별을 (M/F) 입력하세요 : ");
        char studentGender = sc.nextLine().charAt(0);

        return new 학생(studentNumber, studentName, studentGender);
    }

    // 학생 정보 출력
    public void display(학생 student) {
        System.out.println(student.toString());
    }
}
