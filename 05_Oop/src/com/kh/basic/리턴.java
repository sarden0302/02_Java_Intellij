package com.kh.basic;

public class 리턴 {
    /*
    *  return 은 메서드에서 값을 반환하거나 종료할 때 사용되는 키워드
    *
    * */

    public void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자 입니다.");
            return;
        }
        System.out.println("맥주 주문하시겠어요?");
    }
}
