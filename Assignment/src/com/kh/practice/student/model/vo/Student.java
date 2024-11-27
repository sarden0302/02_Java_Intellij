package com.kh.practice.student.model.vo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {
    private String name;
    private String subject;
    private int score;

    public String inform() {
        return "이름 : " + this.name + " / 과목 : " + this.subject + " / 점수 : " + this.score;
    }

}
