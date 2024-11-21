package com.kh.oop.methodPre;

public class VoidPre {

    public void method1(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("섭씨 " + celsius + "는 화씨" + fahrenheit + "도입니다.");
    }

    public void method2(String studentName) {
        System.out.println("학생 이름 : " + studentName);
    }

    public void method3(String items, int price) {
        System.out.println("상품명 : " + items + ", 가격 : " + price + "원");
    }

    public void method4(int time) {
        System.out.println("총 " + time + "분입니다.");
    }

    public void method5(String exercise, int time) {
        System.out.println("운동 : " + exercise + ", 지속 시간 : " + time + "분");
    }

    public void method6(String number, double remain) {
        System.out.printf("계좌번호 : %s, 잔액 : %.2f원입니다\n", number, remain);
    }

    public void method7(String title, double score) {
        System.out.println("영화 제목 : " + title + ", 평점 : " + score + "/10");
    }

    public void method8(String carType, int speed) {
        System.out.println("차량명 : " + carType + ", 최고 속도 : " + speed + "km/h");
    }

    public void method9(String receiver, String title) {
        System.out.println("수신자 : " + receiver + ", 제목 : " + title);
    }

    public void method10(String name, int quantity) {
        System.out.println("상품명 : " + name + ", 수량 : " + quantity + "개");
    }
}
