package practice241119;

import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);
    public void order() {
        int index = 0;
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
            } else if (index == 2) {
                System.out.println("라떼를 선택하셨습니다.");
            } else if (index == 3) {
                System.out.println("카푸치노를 선택하셨습니다. ");
            }

        }

    }
}
