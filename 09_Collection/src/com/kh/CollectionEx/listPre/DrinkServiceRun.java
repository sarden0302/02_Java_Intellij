package com.kh.CollectionEx.listPre;

import java.util.Scanner;

public class DrinkServiceRun {
    public static void main(String[] args) {
        DrinkService drinkService = new DrinkService();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("★★★★★★★★★★★★★★★★★★★");
            System.out.println("★★★★★ 음료 공장 메뉴 ★★★★★");
            System.out.println("1. 음료 추가");
            System.out.println("2. 음료 목록 보기");
            System.out.println("3. 음료 검색 (이름으로 검색하기)");
            System.out.println("4. 음료 검색 (가격으로 검색하기)");
            System.out.println("5. 음료 삭제하기");
            System.out.println("6. 종료");
            System.out.println("★★★★★★★★★★★★★★★★★★★");
            System.out.print("원하는 작업 번호를 선택하세요 : ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    System.out.println("\n--- 음료 추가하기 ---");
                    System.out.print("음료 이름을 입력하세요 : ");
                    String drinkName = scanner.nextLine();
                    System.out.print("음료 가격을 입력하세요 : ");
                    int drinkPrice = Integer.parseInt(scanner.nextLine());
                    drinkService.addDrink(new Drink(drinkName, drinkPrice));
                    break;
                case 2:
                    System.out.println("\n--- 음료 목록 ---");
                    if (drinkService.d.isEmpty()) {
                        System.out.println("현재 데이터에 음료 목록이 없습니다.");
                        break;
                    }
                    drinkService.allDrinks();
                    break;
                case 3:
                    System.out.println("\n--- 음료 검색하기 ---");
                    if (drinkService.d.isEmpty()) {
                        System.out.println("현재 데이터에 음료 목록이 없습니다.");
                        break;
                    }
                    System.out.print("검색할 음료명을 입력하세요 : ");
                    String searchName = scanner.nextLine();
                    drinkService.searchDrink(searchName);
                    break;
                case 4:
                    System.out.println("\n--- 음료 검색하기 ---");
                    if (drinkService.d.isEmpty()) {
                        System.out.println("현재 데이터에 음료 목록이 없습니다.");
                        break;
                    }
                    System.out.print("검색할 가격을 입력하세요 : ");
                    String searchPrice = scanner.nextLine();
                    drinkService.searchDrink(searchPrice);
                    break;
                case 5:
                    System.out.println("\n--- 음료 삭제하기 ---");
                    if (drinkService.d.isEmpty()) {
                        System.out.println("현재 데이터에 음료 목록이 없습니다.");
                        break;
                    }
                    System.out.print("삭제할 음료명을 입력하세요 : ");
                    String deleteName = scanner.nextLine();

                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 번호를 입력하셨습니다. 다시 입력해주세요.");
                    break;
            }
        }
    }
}
