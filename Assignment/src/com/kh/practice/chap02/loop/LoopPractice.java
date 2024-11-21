package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
    Scanner sc = new Scanner(System.in);
    public void practice1() {
        try {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }

            for (int i = 1; i <= input; i++) {
                System.out.print(i + " ");
            }

        } catch (Exception e) {
            System.out.println("1 이상의 숫자를 입력하세요.");
            practice1();
        }
    }

    public void practice2() {
        try {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }

            for (int i = 1; i <= input; i++) {
                System.out.print(i + " ");
            }

        } catch (Exception e) {
            System.out.println("1 이상의 숫자를 입력하세요.");
            practice2();
        }
    }

    public void practice3() {
        try {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }

            for (int i = input; i > 0;  i--) {
                System.out.print(i + " ");
            }

        } catch (Exception e) {
            System.out.println("1 이상의 숫자를 입력하세요.");
            practice3();
        }
    }

    public void practice4() {
        try {
            System.out.print("1이상의 숫자를 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }

            for (int i = input; i > 0;  i--) {
                System.out.print(i + " ");
            }

        } catch (Exception e) {
            System.out.println("1 이상의 숫자를 입력하세요.");
            practice4();
        }
    }

    public void practice5() {
        try {
            System.out.print("정수를 하나 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }
            int total = 0;
            for (int i = 1; i < input; i++) {
                System.out.print(i + " + ");
                total += i;
            }
            total += input;
            System.out.println(input + " = " + total);

        } catch (Exception e) {
            System.out.println("1 이상의 숫자를 입력하세요.");
            practice5();
        }

    }

    public void practice6() {
        try {
            System.out.print("첫 번째 숫자 : ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("두 번째 숫자 : ");
            int num2 = Integer.parseInt(sc.nextLine());
            if (num1 <= 1 || num2 <= 1) {
                throw new NumberFormatException();
            }

            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            practice6();
        }
    }

    public void practice7() {
        try {
            System.out.print("첫 번째 숫자 : ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("두 번째 숫자 : ");
            int num2 = Integer.parseInt(sc.nextLine());
            if (num1 <= 1 || num2 <= 1) {
                throw new NumberFormatException();
            }

            if (num1 > num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }

        } catch (NumberFormatException e) {
            System.out.println("1 이상의 숫자를 입력해주세요.");
            practice7();
        }
    }

    public void practice8() {
        try {
            System.out.print("숫자 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 1 || input > 9) {
                throw new NumberFormatException();
            }
            System.out.println("===== " + input + "단 =====");
            for (int i = 1; i <= 9; i++) {
                System.out.println(input + " * " + i + " = " + (i * input));
            }

        } catch (NumberFormatException e) {
            System.out.println("2 이상의 9 이하의 숫자를 입력해주세요.");
            practice8();
        }
    }

    public void practice9() {
        try {
            System.out.print("숫자 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <=1) {
                throw new NumberFormatException();
            }
            if (input > 9) {
                System.out.println("9이하의 숫자만 입력해주세요.");
                practice9();
                return;
            }

            for (int i = input; i <= 9; i++) {
                System.out.println("===== " + i + "단 =====");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }

        } catch(NumberFormatException e) {
            System.out.println("양수만 작성하세요");
            practice9();
        }
    }

    public void practice10() {
        try {
            System.out.print("숫자 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <=1) {
                throw new NumberFormatException();
            }
            if (input > 9) {
                System.out.println("9이하의 숫자만 입력해주세요.");
                practice9();
                return;
            }

            for (int i = input; i <= 9; i++) {
                System.out.println("===== " + i + "단 =====");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }

        } catch(NumberFormatException e) {
            System.out.println("양수만 작성하세요");
            practice10();
        }
    }

    public void practice11() {
        try {
            System.out.print("시작 숫자 : ");
            float start = Float.parseFloat(sc.nextLine());
            System.out.print("공차 : ");
            float difference = Float.parseFloat(sc.nextLine());

            for (int i = 0; i < 10; i++) {
                System.out.print((start + i * difference) + " ");
            }
        } catch (Exception e) {
            System.out.println("숫자로 입력하세요");
            practice11();
        }
    }

    public void practice12() {
        while (true) {
            System.out.print("연산자(+, -, *, /, %) : ");
            String operator = sc.nextLine();
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("%") && !operator.equalsIgnoreCase("exit")) {
                System.out.println("없는 연산자입니다. 다시 입력해주세요.");
                continue;
            }
            if (operator.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            try {
                System.out.print("정수1 : ");
                int num1 = Integer.parseInt(sc.nextLine());
                System.out.print("정수 2 : ");
                int num2 = Integer.parseInt(sc.nextLine());

                if (num2 == 0 && (operator.equals("/") || operator.equals("%"))) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    continue;
                }

                if (operator.equals("+")) {
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (operator.equals("-")) {
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (operator.equals("*")) {
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                } else if (operator.equals("/")) {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
            } catch (NumberFormatException e) {
                System.out.println("정수를 입력해주세요.");
                practice12();
            }

        }
    }

    public void practice13() {
        try {
            System.out.print("정수 입력 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input < 1) {
                throw new NumberFormatException();
            }
            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("양의 정수만 입력해주세요.");
            practice13();
        }
    }

    public void practice14() {
        try {
            System.out.print("정수 입력 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input < 1) {
                throw new NumberFormatException();
            }
            for (int i = 1; i <= input; i++) {
                for (int j = i; j <= input; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("양의 정수만 입력해주세요.");
            practice13();
        }
    }
}
