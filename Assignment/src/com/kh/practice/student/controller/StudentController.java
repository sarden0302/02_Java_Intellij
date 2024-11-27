package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class StudentController {
    private Student[] sArr = new Student[5];
    public final int CUT_LINE = 60;

    public Student[] printStudent() {
        sArr[0] = new Student("김길동", "자바", 100);
        sArr[1] = new Student("박길동", "디비", 50);
        sArr[2] = new Student("이길동", "화면", 85);
        sArr[3] = new Student("정길동", "서버", 60);
        sArr[4] = new Student("홍길동", "자바", 20);
        return sArr;
    }

    public int sumScore() {
        int sum = 0;
        for (Student student : sArr) {
            sum += student.getScore();
        }
        return sum;
    }

    public double[] avgScore() {
        return new double[]{(double)sumScore(), (double)sumScore() / sArr.length};
    }
}
