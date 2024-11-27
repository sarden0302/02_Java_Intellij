package com.kh.CollectionEx.pack1.listEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ClothingStore {
    private ArrayList<Clothing> clothes = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // 옷 추가 기능
    public void addClothing() {
        System.out.print("옷 이름: ");
        String name = sc.nextLine();
        System.out.print("카테고리 (상의/하의/외투 등) : ");
        String category = sc.nextLine();
        System.out.print("가격 : ");
        String price = sc.nextLine();

        clothes.add(new Clothing(name, category, price));
        System.out.println("[" + name + "] 추가 완료!");
    }

    // 추가된 옷 리스트를 확인하는 기능
    public void allClothing() {
        if (clothes.isEmpty()) {
            System.out.println("현재 옷의 목록은 비어있습니다. ");
            return;
        }
        for(Clothing c : clothes) {
            System.out.println(c);
        }
    }

    // 옷 검색
    public void searchClothing() {
        if (clothes.isEmpty()) {
            System.out.println("현재 옷의 목록은 비어있습니다. ");
            return;
        }
        System.out.print("옷 이름을 검색해주세요 : ");
        String name = sc.nextLine();
        for (Clothing cloth : clothes) {
            if (name.equalsIgnoreCase(cloth.getName())) {
                System.out.println("찾으신 정보의 상세 정보는 : " + cloth);
                return;
            }
        }
        System.out.println("찾으시는 품목은 삭제되었거나 없는 품목입니다.");
    }

    //옷 수정
    public void editClothing() {
        if (clothes.isEmpty()) {
            System.out.println("현재 옷의 목록은 비어있습니다. ");
            return;
        }
        System.out.print("옷 이름을 검색해주세요 : ");
        String name = sc.nextLine();
        for (Clothing cloth : clothes) {
            if (name.equalsIgnoreCase(cloth.getName())) {
                System.out.println("수정하고 싶은 목록을 선택해주세요 ");
                System.out.println("1.이름, 2. 카테고리, 3. 가격");
                System.out.print("목록 입력 : ");
                int choice = Integer.parseInt(sc.nextLine());

                switch(choice) {
                    case 1:
                        System.out.print("수정하고 싶은 이름을 작성해주세요 : ");
                        name = sc.nextLine();
                        cloth.setName(name);
                        return;
                    case 2:
                        System.out.print("수정하고 싶은 카테고리를 작성해주세요 : ");
                        name = sc.nextLine();
                        cloth.setCategory(name);
                        return;
                    case 3:
                        System.out.print("수정하고 싶은 가격을 작성해주세요 : ");
                        name = sc.nextLine();
                        cloth.setPrice(name);
                        return;
                    default:
                        System.out.println("목록에 없는 번호입니다. 메인화면으로 돌아갑니다.");
                        return;
                }
            }
        }

    }

    //옷 삭제
    public void removeClothing() {
        if (clothes.isEmpty()) {
            System.out.println("현재 옷의 목록은 비어있습니다. ");
            return;
        }
        System.out.println("\n=== 옷 제거 ===");
        System.out.print("옷 이름을 검색해주세요 : ");
        String name = sc.nextLine();
        for (int  i = 0; i < clothes.size() ; i++) {
            if (name.equalsIgnoreCase(clothes.get(i).getName())) {
                clothes.remove(i);
                System.out.println("삭제되었습니다.");
                for (Clothing c : clothes) {
                    System.out.println(c);
                }
                return;
            }
        }
        System.out.println("일치하는 옷이 없습니다.");
    }
}
