package loof;

import java.util.Scanner;

public class LoofDowhile {
    public void method1() {
        int sum = 0;
        int input = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("정수 입력 : ");
            input = sc.nextInt();
            sum += input;
        } while (input != 0);
    }
}
