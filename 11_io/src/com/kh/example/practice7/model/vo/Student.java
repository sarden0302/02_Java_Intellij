package com.kh.example.practice7.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student {
    private String name;
    private String subject;
    private int score;

    @Override
    public String toString() {
        return "이름 : " + this.name + " / 과목 : " + this.subject + " / 점수 : " + this.score;
    }

}
