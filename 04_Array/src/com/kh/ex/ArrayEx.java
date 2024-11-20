package com.kh.ex;

import java.util.Scanner;

public class ArrayEx {
    Scanner sc = new Scanner(System.in);

    public void method1() {
        int num;
        //Stack 영역에 int 자료형을 저장할 수 있는 변수를 생성 & 저장

        int[] arr;
        //Stack 영영게 int[]자료형을 참조할 수 있는 변수를 생성 & 저장

        arr = new int[10];
        // Heap 영역에 int 10개짜리 배열을 할당한 후
        // 생성된 배열의 주소를 arr변수에 대입

        arr[0] = 100;
        arr[1] = 100;
        arr[2] = 3000;
        arr[3] = 5;
        arr[4] = 7777;
    }

    public void method2() {
        int x = 10; //Stack에 저장
        int[] arr = new int[3];//Stack에 arr저장 & Heap에 3가지 데이터 할당
        arr[0] = 100; //Heap 영역 내 arr[0]에 100할당
    }

    public void method3() {
        int[] arr = new int[4];

    }

    public void method4() {
        int[] arr = {4, 6, 7, 3, 9};

        for (int  i = arr.length - 1; i >= 0; i--) {
            //주소의 위치는 계속 바뀐다
            System.out.println(arr);
            System.out.println(arr[i]);
        }
    }

    public void method5() {
        String[] days = {"월", "화", "수", "목", "금", "토", "일"};

        for (int i =0;i < days.length;i++) {
            System.out.println(days[i]);
        }
    }
}
