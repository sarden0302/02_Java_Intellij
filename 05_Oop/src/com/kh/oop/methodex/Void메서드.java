package com.kh.oop.methodex;

public class Void메서드 {
    public void method1() {
        System.out.println("안녕하세요.");
    }

    public void method2(String userId) {
        System.out.println("안녕하세요, " + userId + "님!");
    }

    public void method3(int userAge) {
        System.out.println("나이는 " + userAge + "입니다.");
    }

    //자료형과 매개변수가 두 개 이상 들어갈 때 method
    public void method4(String name, int age) {
        System.out.println(name + "님, 나이는 " + age + "입니다.");
    }

    public void login(String id, String pw) {
        System.out.println("아이디는 " + id);
        System.out.println("패스워드는 " + pw);
    }

    public void findId(String name, String email) {
        System.out.println("아이디는 kht 입니다.");
    }
}
