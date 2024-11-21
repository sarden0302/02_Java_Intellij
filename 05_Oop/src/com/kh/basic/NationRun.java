package com.kh.basic;

public class NationRun {
    public static void main(String[] args) {

        Nation n = new Nation();

        n.name = "홍길동"; //.(=하위 접근 연산자)을 활용해 nation 클래스에 직접 연결해 데이터 입력
        n.age = 18;
        n.gender = 'M';
        n.introduce();
        n.납세의의무();
        System.out.println();

        String name1 ="홍길동";
        int age1 = 18;
        char gender1 = 'M';
        System.out.printf("이름은 %s이고 %d세 %c성 입니다. \n", name1, age1, gender1);
        System.out.println();

        n.name = "신짱구"; //.(=하위 접근 연산자)을 활용해 nation 클래스에 직접 연결해 데이터 입력
        n.age = 5;
        n.gender = 'F';
        n.introduce();
        n.납세의의무();
        System.out.println();

        String name2 = "신짱구";
        int age2 = 5;
        char gender2 = 'F';
        System.out.printf("이름은 %s이고 %d세 %c성 입니다. \n", name2, age2, gender2);
        System.out.println();

        Nation n2 = new Nation();
        n2.name = "박달래";
        n2.age = 70;
        n2.gender = 'F';
        n2.introduce();
        n2.납세의의무();
        System.out.println();

    }
}
