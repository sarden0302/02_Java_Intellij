package com.kh.practice.array;

import java.util.Scanner;

//cmd랑 console은 같은 개념
public class ArrayPractice {
    Scanner sc = new Scanner(System.in);
    public void practice1() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice2() {
        int[] arr = new int[10];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }

    public void practice3() {
        try {
            System.out.print("양의 정수 : ");
            int arrLength = Integer.parseInt(sc.nextLine());
            if (arrLength <= 0) {
                throw new Exception();
            }
            int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println("정수만 입력해주세요");
            practice3();
        } catch (Exception e) {
            System.out.println("양수를 입력해주세요");
            practice3();
        }
    }

    public void practice4() {
        String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};

        System.out.println(fruit[1]);
    }

    public void practice5() {
        System.out.print("문자열 : ");
        String input = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.next().charAt(0);
        int count = 0;
        String index = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
                index += i + " ";
            }
        }
        System.out.println(input + "에 " + ch + "가 존재하는 위치(인덱스) : " + index);
        System.out.println(ch + " 개수 : " + count);
    }

    public void practice6() {
        try {
            System.out.print("0 ~ 6 사이 숫자 입력 : ");
            int num = Integer.parseInt(sc.nextLine());
            if (num < 0 || num > 7) {
                throw new Exception();
            }
            String[] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
            System.out.println(week[num]);

        } catch (NumberFormatException e) {
            System.out.println("정수로 입력해주세요");
            practice6();
        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.");
            practice6();
        }
    }

    public void practice7() {
        try {

        } catch()
    }


}
