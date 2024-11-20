package practice241119;

import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);
    public void order() {
        int index = 0;
        int total = 0;
        while(index != 4) {
            System.out.println("=== 메뉴판 ===");
            System.out.println("1. 아메리카노 - 3000원");
            System.out.println("2. 라떼 - 4000원");
            System.out.println("3. 카푸치노 - 4500원");
            System.out.println("4. 주문 종료 ");
            System.out.print("메뉴를 선택하세요 (1~4):");
            index = sc.nextInt();

            if (index == 1) {
                System.out.println("아메리카노를 선택하셨습니다. ");
                total += 3000;
            } else if (index == 2) {
                System.out.println("라떼를 선택하셨습니다.");
                total += 4000;
            } else if (index == 3) {
                System.out.println("카푸치노를 선택하셨습니다. ");
                total += 4500;
            } else if (index != 4){
                System.out.println("잘못 선택하셨습니다.");
            }
        }
        System.out.println("주문을 종료합니다.\n총 주문 금액 : " + total + "원");

    }
}
