package com.kh.practice.chap02;

import java.util.*;

public class LoopPractice {
    Scanner sc = new Scanner(System.in);
    public void practice015() {
        try {
            System.out.print("숫자 : ");
            int decimal = Integer.parseInt(sc.nextLine());
            if (decimal <= 0) {
                throw new Exception();
            }
            if (decimal == 1) {
                System.out.println("소수가 아닙니다.");
                return;
            }
            if (decimal == 2 || decimal == 3) {
                System.out.println("소수입니다.");
                return;
            }

            for (int i = 2; i < decimal; i++) {
                if (decimal % i == 0) {
                    System.out.println("소수가 아닙니다");
                    return;
                }
            }
            System.out.println("소수입니다");
        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.");
            practice015();
        }
    }

    public void practice16() {
        try {
            System.out.print("숫자 : ");
            int decimal = Integer.parseInt(sc.nextLine());
            if (decimal < 2) {
                throw new Exception();
            }

            for (int i = 2; i < decimal; i++) {
                if (decimal % i == 0) {
                    System.out.println("소수가 아닙니다");
                    return;
                }
            }
            System.out.println("소수입니다");
        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.");
            practice16();
        }
    }

    public void practice17() {
        try {
            System.out.print("숫자 : ");
            int decimal = Integer.parseInt(sc.nextLine());
            if (decimal < 2) {
                throw new Exception();
            }

            List<Integer> decimalList = new ArrayList<Integer>();
            int count = 0;
            if (decimal == 2 || decimal == 3) {
                System.out.println(decimal + "\n" + decimal + "까지의 소수의 개수는 1개입니다.");
                return;
            }
            for (int i = 2; i <= decimal; i++) {
                if (practice17FindingDecimals(decimalList, i)) {
                    count++;
                }
            }
            if (decimalList.size() == 1) {
                System.out.println(decimalList.get(0) + "\n" + decimalList.get(0) + "까지 소수의 개수는 1개입니다.");
                return;
            }
            for (int d : decimalList) {
                System.out.print(d + " ");
            }
            System.out.println("\n" + decimal + "까지 소수의 개수는 " + count + "개입니다.");

        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.");
            practice17();
        }
    }

    public boolean practice17FindingDecimals(List<Integer> decimalList, int decimal) {
        for (int i  = 2; i < decimal; i++) {
            if (decimal % i == 0) {
                System.out.println(i);
                return false;
            }
        }
        decimalList.add(decimal);
        return true;
    }

    public void practice18() {
        try {
            System.out.print("자연수 하나를 입력하세요 : ");
            int input = Integer.parseInt(sc.nextLine());
            int count = 0;
            String result = "";

            for (int i =2; i <= input; i++) {
                if (i % 2 == 0 || i % 3 == 0) {
                    result += i + " ";
                    if (i % 2 == 0 && i % 3 == 0) {
                        count++;
                    }
                }
            }
            System.out.println(result);
            System.out.println("count : " + count);
        } catch (Exception e) {
            System.out.println("양수만 입력하세요.");
            practice18();
        }
    }

    public void practice19() {
        try {
            System.out.print("정수 입력 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }
            int count = 1;
            for (int i = 0; i < input; i++) {
                for (int j = 0; j < input - i - 1; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
                System.out.println();
                count++;
            }
        } catch (Exception e) {
            System.out.println("양수만 입력해주세요");
            practice19();
        }
    }

    public void practice20() {
        try {
            System.out.print("정수 입력 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }

            for (int i = 1; i <= input; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = input - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("양의 정수만 입력하세요.");
            practice20();
        }
    }

    public void practice21() {
        try {
            System.out.print("정수 입력 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }
            boolean[][] tree = new boolean[input][input * 2];
            int count = 1;

            for (int row = 0; row < input; row++) {
                tree[row][input - 1] = true;
                for (int col = 1; col < count; col++) {
                    tree[row][input - 1 - col] = true;
                    tree[row][input - 1 + col] = true;
                }
                count++;
            }

            for (int row = 0; row < tree.length; row++) {
                for (int col = 0; col < tree[0].length; col++) {
                    if (!tree[row][col]) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("양의 정수만 입력하세요.");
            practice21();
        }
    }

    public void practice22() {
        try {
            System.out.print("정수 입력 : ");
            int input = Integer.parseInt(sc.nextLine());
            if (input <= 0) {
                throw new Exception();
            }

            for (int i = 0 ; i < input; i++) {
                if (i == 0 || i == input - 1) {
                    for (int j = 0; j < input; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int j = 1; j < input - 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("양의 정수만 입력하세요.");
            practice22();
        }
    }

}
