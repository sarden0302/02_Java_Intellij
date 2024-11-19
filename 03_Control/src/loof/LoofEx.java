package loof;

import java.util.Scanner;

public class LoofEx {
    //field = 지역변수

    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.print("Enter an integer : ");

        int num = sc.nextInt();
        System.out.println("num = " + num);

        for (int i = 0; i < 10; i++) {
            System.out.println("i의 값 = " + i);
        }
    }

    public void method2() {
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        System.out.print("Enter another integer : ");
        int num2 = sc.nextInt();

        if (num > num2) {
            System.out.println("첫번째 숫자가 두번째 숫자보다 작습니다. 다시 작성해주세요.");
            method2();
        } else if (num < num2) {
            for (int i = num; i <= num2; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("두 수는 동일하고 값은 " + num + "입니다.");
        }
    }

    public void method3() {
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }
    }

    public void method4() {
        System.out.print("A의 값 : ");
        int num1 = sc.nextInt();
        System.out.print("B의 값 : ");
        int num2 = sc.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println("A ~ B : "  + i);
            }
            return;
        }
        for (int i = num1; i >= num2; i--) {
            System.out.println("A ~ B : "  + i);
        }

    }
}
