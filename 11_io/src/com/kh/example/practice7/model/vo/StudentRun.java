package com.kh.example.practice7.model.vo;
import com.kh.example.practice7.model.vo.StudentController;

public class StudentRun {
    static StudentController ssm = new StudentController();
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("김길동", "자바", 100);
        students[1] = new Student("박길동", "디비", 50);
        students[2] = new Student("이길동", "화면", 85);
        students[3] = new Student("정길동", "서버", 60);
        students[4] = new Student("홍길동", "자바", 20);
        ssm.setSArr(students);
        System.out.println("========== 학생 정보 출력 ==========");
        ssm.printStudent();
        for (Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
        System.out.println("========== 학생 성적 출력 ==========");
        double[] result = ssm.avgScore();
        System.out.println("학생 점수 합계 : " + result[0]);
        System.out.println("학생 점수 평균 : " + result[1]);
        System.out.println();
        System.out.println("========== 성적 결과 출력 ==========");
        for (Student student : students) {
            if (student.getScore() >= ssm.getCUT_LINE()) {
                System.out.println(student.getName() + "학생은 통과입니다.");
            } else {
                System.out.println(student.getName() + "학생은 재시험 대상입니다.");
            }
        }
    }
}
