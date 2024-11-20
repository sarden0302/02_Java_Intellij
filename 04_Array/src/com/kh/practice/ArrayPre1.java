package com.kh.practice;

import java.util.Scanner;

public class ArrayPre1 {
    Scanner sc = new Scanner(System.in);
    public void practice3() {
        System.out.println("Enter the size of the array");
        int index = Integer.parseInt(sc.nextLine());
        int[] arr = new int[index];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

    public void practice4() {
        String[] fruit = new String[5];
        fruit[0] = "사과";
        fruit[1] = "귤";
        fruit[2] = "포도";
        fruit[3] = "복숭아";
        fruit[4] = "참외";

        System.out.println(fruit[1]);
    }

    public void practice6() {
        try {
            char[] arr = new char[14];

            System.out.print("주민등록번호(-포함) : ");
            String input = sc.nextLine();

            int len = input.length();
            for (int i = 0; i < len; i++) {
                if (i <= 7) {
                    arr[i] = input.charAt(i);
                }
            }
        } catch (Exception e) {
            System.out.println("번호만 입력하세요");
            practice6();
        }
    }

    public void practice6A() {
        String REGEXP_NUMBER = "\\+\\d{2}\\-\\d{3}\\-\\d{4}\\-\\d{4}";
        try {
            char[] phoneNumber = new char[17];
            System.out.print("전화번호를 입력해주세요 : ");
            String result = sc.nextLine();
            if (!result.matches(REGEXP_NUMBER)) {
                throw new NumberFormatException();
            }
            for (int i = 0;i < 17; i++) {
                phoneNumber[i] = result.charAt(i);
            }

            result = result.substring(0, 8);
            for (int i = 8 ; i < 17; i++) {
                if (i == 12) {
                    result += "-";
                } else {
                    result += "*";
                }
            }
            System.out.print(result);
        } catch (NumberFormatException e) {
            System.out.println("+xx-xxx-xxxx-xxxx 형식으로 작성해주세요.");
            practice6A();
        }
    }

    public void practice6B() {
        String countryCode = "+82-";

        System.out.print("전화번호(-포함)");
        String input = sc.nextLine();

        String fullNumber = countryCode + input;

        char[] arr = new char[fullNumber.length()];

        for (int i = 0; i < fullNumber.length(); i++) {

        }
    }
}
