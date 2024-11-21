package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
    Scanner sc = new Scanner(System.in);
    int count = 0;

    public void upDown() {
        int rand = (int)(Math.random() * 100) + 1;
        boolean checking = false;
        while (!checking) {
            checking = upDownChecking(rand);
        }
        System.out.println(count + "회만에 맞췄습니다.");
    }

    public boolean upDownChecking(int rand) {
        try {
            System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
            int num = Integer.parseInt(sc.nextLine());
            if (num <= 0 || num > 100) {
                throw new Exception();
            }
            count++;
            if (num == rand) {
                System.out.println("정답입니다");
                return true;
            }

            if (num < rand) {
                System.out.println("UP !");
                return false;
            }

            System.out.println("DOWN !");
            return false;

        } catch (Exception e) {
            System.out.println("1~100 사이의 숫자를 입력해주세요.");
            return upDownChecking(rand);
        }
    }
}
