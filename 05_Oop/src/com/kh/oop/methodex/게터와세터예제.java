package com.kh.oop.methodex;

public class 게터와세터예제 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        /*
            setter에 값을 저장할 때 유효성 검사와 같은 if문은 넣지 않는다.
            함수 부르기 전에 검사한다.

            if (age < 0) {
                System.out.println("실행할 수 없습니다");
            }
            작성 x

         */
        this.age = age;
    }
}
