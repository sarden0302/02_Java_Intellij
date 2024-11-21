package com.kh.basic;

/*
*   Class : 객체가 가져야할 속성(값), 기능(메서드)를 클(코드)로 작성해둔 문서(설계도)
* */

// 객체
public class Nation {
    // field(필드) : 속성 값
    String name;
    int age;
    char gender;
    //주민번호부터 주소까지 사용되지 않았습니다
    //자바에서 가비지컬렉션에서 알아서 메모리에서 알아서 정리될 것
    String juminNumber;
    String tel;
    String address;

    //method
    public void speak() {
        System.out.println("가나다라 한국어 가능합니다.");
    }

    public void 납세의의무() {
        if (this.age >= 19) {
            System.out.println(this.name + "님은 세금 납부 대상자입니다.");
        } else {
            System.out.println(this.name + "님은 " + this.age + "세 미성년자로 납부 대상자가 아닙니다.");
        }
    }

    public void introduce() {
        System.out.println("이름은 " + this.name + ", 나이는 " + this.age + "이고, 성별은 " + this.gender + "성입니다.");
    }
}
