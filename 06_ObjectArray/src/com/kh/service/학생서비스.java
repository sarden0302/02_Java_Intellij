package com.kh.service;

import com.kh.dto.학생;

// Service 클래스 : 기능 제공 클래스
// -> 입력 출력 뺴고 나머지 모두 작성
// if && for 문을 이용해서 데이터 가공 && 저장
// run에서 작성했던 학생을 추가, 삭제, 수정..etc
public class 학생서비스 {

    private 학생 s1; //dto에 만든 학생 가져오기

    public void 학생추가하기(String studentNumber, String studentName, char gender) {
        s1 = new 학생(studentNumber, studentName, gender);
    }

    public 학생 getS1() {
        return s1;
    }


}
