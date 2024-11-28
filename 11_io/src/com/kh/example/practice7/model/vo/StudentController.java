package com.kh.example.practice7.model.vo;

import com.kh.example.practice7.model.vo.Student;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class StudentController {
    private Student[] sArr = new Student[5];
    private final int CUT_LINE = 60;

    public Student[] printStudent() {
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
