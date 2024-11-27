package com.kh.CollectionEx.pack1.listEx;

import java.util.Scanner;

public class ClothingStoreRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClothingStore clothingStore = new ClothingStore();

        while (true) {
            System.out.println("\n=== 옷 쇼핑몰 관리 프로그램 ===");
            System.out.println("1. 옷 추가");
            System.out.println("2. 옷 목록 조회");
            System.out.println("3. 옷 검색");
            System.out.println("4. 옷 수정");
            System.out.println("5. 옷 삭제");
            System.out.println("6. 프로그램 종료");
            System.out.print("메뉴 선택 : ");
            int choice = Integer.parseInt(sc.nextLine());

            switch(choice) {
                case 1:
                    clothingStore.addClothing();
                    break;
                case 2:
                    clothingStore.allClothing();
                    break;
                case 3:
                    clothingStore.searchClothing();
                    break;
                case 4:
                    clothingStore.editClothing();
                    break;
                case 5:
                    clothingStore.removeClothing();
                    break;
                case 6:
                    System.out.println("프로그램 종료합니다.");
                    return;
                default:
                    System.out.println("보기에 없는 목록입니다. 다시 입력해주세요.");
            }
        }


    }
}
