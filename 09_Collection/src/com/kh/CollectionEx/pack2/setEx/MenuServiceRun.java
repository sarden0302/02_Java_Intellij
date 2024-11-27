package com.kh.CollectionEx.pack2.setEx;

import java.util.Scanner;

public class MenuServiceRun {

    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 메뉴 관리 시스템 ===");
            System.out.println("1. 메뉴 추가");
            System.out.println("2. 메뉴 삭제");
            System.out.println("3. 메뉴 검색");
            System.out.println("4. 모든 메뉴 조회");
            System.out.println("5. 종료");
            System.out.print("선택 : ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    System.out.print("메뉴 ID 입력 : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("메뉴 이름 입력 : ");
                    String name = scanner.nextLine();
                    System.out.print("메뉴 가격 입력 : ");
                    double price = Double.parseDouble(scanner.nextLine());

                    Menu menu = new Menu(id, name, price);
                    menuService.addMenu(menu);
                    break;
                case 2:
                    System.out.println("--- 메뉴를 삭제하는 공간입니다. ---");
                    System.out.print("삭제할 메뉴 ID 입력 : ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    menuService.removeMenu(deleteId);
                    break;
                case 3:
                    System.out.println("--- 메뉴를 검색하는 공간입니다. ---");
                    System.out.print("검색할 메뉴 ID 입력 : ");
                    int searchId = Integer.parseInt(scanner.nextLine());
                    menuService.searchMenu(searchId);
                    break;
                case 4:
                    System.out.println("--- 메뉴를 모두 조회하는 공간입니다. ---");
                    menuService.printAllMenu();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    break;
            }
        }
    }
}
