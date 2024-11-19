package practice.condition;

import java.util.Scanner;

public class ConditionPre {
    static Scanner sc = new Scanner(System.in);
    public void methodAge() {
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        switch (age / 10) {
            case 1: case 0:
                System.out.println("13세 이하 어린이");
                break;
            case 2:
                if (age  <= 18) {
                    System.out.println("18세 이하 청소년");
                } else {
                    System.out.println("19세 이상 성인");
                }
                break;
            default:
                System.out.println("19세 이상 성인");
                break;
        }
    }
}
