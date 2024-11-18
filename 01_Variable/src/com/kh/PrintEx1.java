package com.kh;

public class PrintEx1 {
    public static void main(String[] args) {
        /*
        * 패턴 종류
        * %d : 정수(byte, short, int)
        * %c : 문자(char)
        * %s : 문자열(String)
        * %b : 논리형(boolean)
        * %f : 실수형(float, double)

        * 양수 : 오른쪽 정렬
        * 음수 : 왼쪽 정렬
        *
        * %.숫자f : 소수점 아래 몇번째 자리까지 표시할지 지정
        * (지정된 자리 아래에서 반올림 처리)
        *
        * - 두번째 매개변수
        * -- 첫번째 매개변수 문자열 중 패턴에 들어갈 변수 값을 순서대로 작성
        * */

        System.out.print("이름 : ");
        System.out.print("KHT");

        System.out.println(" 입니다.");
        System.out.println("오늘도 재밌는 자바공부 화이팅");

        String name = "KHT";
        System.out.printf("이름 : %s 입니다\n", name);

        String name1 = "홍길동";
        int age = 18;
        double height =  173.99;
        char gender = '남';
        boolean study = true;

        System.out.printf("%s %d세 %.1f cm이고 %c성으로 공부 여부 :%b", name1, age, height, gender, study);


    }
}

