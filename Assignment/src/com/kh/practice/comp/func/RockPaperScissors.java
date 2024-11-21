package com.kh.practice.comp.func;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors {
    Scanner sc = new Scanner(System.in);

    public void rps() {
        System.out.print("당신의 이름을 입력해주세요 : ");
        String user_name = sc.nextLine();

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "가위");
        hashMap.put(1, "바위");
        hashMap.put(2, "보");
        int count = 0;
        int win = 0;
        int lose = 0;
        int draw = 0;
        do {
            System.out.print("가위바위보 : ");
            String rsp = sc.nextLine();
            if (rsp.equalsIgnoreCase("exit")) {
                break;
            }
            count++;

            int computer = (int)(Math.random() * 3);
            System.out.println("컴퓨터 : " + hashMap.get(computer));
            System.out.println(user_name + " : " + rsp);
            if ((rsp.equals("가위") && computer == 0) || (rsp.equals("바위") && computer == 1) || (rsp.equals("보") && computer == 2)) {
                draw++;
                System.out.println("비겼습니다.");
            }
            if ((rsp.equals("가위") && computer == 1) || (rsp.equals("바위") && computer == 2) || (rsp.equals("보") && computer == 0)) {
                lose++;
                System.out.println("졌습니다 ㅠㅠ");
            }
            if ((rsp.equals("가위") && computer == 2) || (rsp.equals("바위") && computer == 0) || (rsp.equals("보") && computer == 1)) {
                win++;
                System.out.println("이겼습니다 !");
            }
        } while(true);
        System.out.println(count + "전 " + win + "승" + draw + "무" + lose + "패");


    }
}
