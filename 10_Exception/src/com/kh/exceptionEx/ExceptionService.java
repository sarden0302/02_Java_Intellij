package com.kh.exceptionEx;

public class ExceptionService {

    // method1 예외 발생
    public void method1() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*  Exception 발생
        Exception in thread "main"
        java.lang.ArrayIndexOutOfBoundsException:
        Index 5 out of bounds for length 5

        try-catch
        - try{}         : 에외
        - catch(예외){}  : 예외 발생시 수행할 구분
        */

    }

    // 발생한 문제 유연하게 처리
    public void method2() {
        int arr[] = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) { // e : 발생된 문제 내용을 저장
                                // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
            System.out.println("값에 문제가 생긴 것 같습니다.");
            System.out.println(e);
        }

    }

}
