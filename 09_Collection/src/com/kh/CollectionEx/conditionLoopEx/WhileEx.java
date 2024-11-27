package com.kh.CollectionEx.conditionLoopEx;

public class WhileEx {
    int abcd = 1;
    boolean isTrue = true;

    public static void main(String[] args) {
        WhileEx ex = new WhileEx();
        ex.method1();
        ex.method2();

    }


    public void method1() {
        isTrue = true;
        while (isTrue) {
            switch (abcd) {
                case 1:
                    System.out.println("1");
                    break;
                default:
                    System.out.println("숫자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
                    isTrue = false;
            }
        }
    }

    public void method2() {
        while(true) {
            int a = 1;
            switch(a) {
                case 1:
                    System.out.println("1");
                    break;
                default:
                    System.out.println("숫자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
