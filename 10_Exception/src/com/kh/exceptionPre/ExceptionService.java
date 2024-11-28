package com.kh.exceptionPre;

public class ExceptionService {

    public void method1() {
        String name1 = "감길자";
        int health1 = 50; // 체력이 100점 만점에 50

        String name2 = "영길동";
        int health2 = 80;

        try {
            // 감길자씨와 홍길동씨의 평균 체력을 계산
            System.out.println(name1 + " 와 " + name2 + " 의 평균 체력을 계산합니다.");

            //문제발생 코드
            int avgHealth = (health1 + health2) / 0;
            System.out.println("평균 체력 : " + avgHealth);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("제가 예상한대로 0으로 평균체력 나눠서 발생한 사건이 맞군요");
        } catch (Exception e) {
            // 예상 못한 Exception으로 맨 마지막에 작성
            System.out.println(e.getMessage());
            System.out.println("어떤 문제인지 어림짐작할 수는 없지만 문제가 발생!");
            System.out.println("문제를 확인하고 개발자 분은 해결하시길 바랍니다.");
        }

    }

    public void method2() {
        try {
            int arr[] = {1,2,3,4,5};

            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
