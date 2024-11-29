package com.kh.pack2.pre;

import java.io.*;

public class FIleWritePre3Test {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        File file = new File(path + "menu.txt");

        if (file.exists()) {
            System.out.println("이미 존재하는 파일입니다.");
            System.out.println("프로그램을 종료합니다.");
            //return;
        }

        try {
            file.createNewFile();
            System.out.println("파일이 생성되었습니다.");
        } catch (IOException e) {
            System.out.println("예기치 못한 에러가 발생했습니다.");
            System.out.println("프로그램을 종료합니다.");
            return;
        }

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("작성해주세요 : ");
            String content = "\n=== BufferedReader 작성 부문 ===" + br.readLine();
            fw.write(content);
            br.close();
            fw.close();
            System.out.println("이어쓰기 작성을 완료했습니다.");
        } catch (IOException e) {
            System.out.println("이어쓰기 작성 중 에러가 발생했습니다.");
        } finally  {
            System.out.println("프로그램을 종료합니다.");
        }


    }
}
