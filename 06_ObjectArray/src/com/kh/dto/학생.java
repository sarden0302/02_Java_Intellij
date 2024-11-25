package com.kh.dto;
// Data Transfer Object

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class 학생 {
    private String studentNumber;
    private String studentName;
    private char gender;

}
