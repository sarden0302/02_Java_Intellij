package practice241121;

import java.util.Scanner;

public class CheckingIdExsist {
    Scanner sc = new Scanner(System.in);
    static String[][] accounts = {
            {"user1", "차주식", "19800101"},
            {"user2", "한정일", "19900215"},
            {"user3", "오정희", "20001231"}
    };

    public void checkingIdExsist() {
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("생년월일을 입력하세요 (YYYYMMDD) : ");
        String birthdate = sc.nextLine();

        for (String[] account : accounts) {
            if (account[1].equals(name) && account[2].equals(birthdate)) {
                System.out.println("일치하는 아이디는 " + account[0]);
                return;
            }
        }
        System.out.println("일치하는 아이디를 찾을 수 없습니다.");
    }

}
