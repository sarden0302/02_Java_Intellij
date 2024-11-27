package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
    private StudentController ssm = new StudentController();

    public StudentMenu() {

        System.out.println("========== 학생 정보 출력 ==========");
        Student[] students = ssm.printStudent();
        for (Student student : students) {
            System.out.println(student.inform());
        }
        System.out.println();
        System.out.println("========== 학생 성적 출력 ==========");
        double[] result = ssm.avgScore();
        System.out.println("학생 점수 합계 : " + result[0]);
        System.out.println("학생 점수 평균 : " + result[1]);
        System.out.println();
        System.out.println("========== 성적 결과 출력 ==========");
        for (Student student : students) {
            if (student.getScore() >= ssm.CUT_LINE) {
                System.out.println(student.getName() + "학생은 통과입니다.");
            } else {
                System.out.println(student.getName() + "학생은 재시험 대상입니다.");
            }
        }

    }
}
