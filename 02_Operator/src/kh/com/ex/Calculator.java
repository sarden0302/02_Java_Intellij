package kh.com.ex;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public void plus() {
        System.out.print("1st number : ");
        int num1 = sc.nextInt();
        System.out.print("1st number : ");
        int num2 = sc.nextInt();

        System.out.println(num1 + num2);
    }

    public void minus() {
        System.out.print("1st number : ");
        int num1 = sc.nextInt();
        System.out.print("1st number : ");
        int num2 = sc.nextInt();

        System.out.println(num1 - num2);
    }

    public void mutiply() {
        System.out.print("1st number : ");
        int num1 = sc.nextInt();
        System.out.print("1st number : ");
        int num2 = sc.nextInt();

        System.out.println(num1 * num2);
    }
}
