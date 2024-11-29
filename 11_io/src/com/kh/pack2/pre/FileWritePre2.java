package com.kh.pack2.pre;

import java.io.*;

public class FileWritePre2 {
    // 바탕하면에 lunch.txt
    // 먹고 싶은 점심메뉴 리스트를 줄바꿈을 이용해서 작성하고
    // 파일이 존재한다면 이미 존재합니다 와 동시에 프로그램 종료
    // main()

    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        File file = new File(path + "lunch.txt");

        try {
            if (file.exists()) {
                System.out.println("파일이 이미 존재합니다.");
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            file.createNewFile();
            System.out.println("파일이 생성되었습니다.");
        } catch (Exception e) {
            System.out.println("파일 생성 실패!");
            System.out.println("프로그램을 종료합니다.");
            return;
        }

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("1. 햄버거\n");
            bw.write("2. 피자\n");
            bw.write("3. 스테이크\n");
            bw.close();
            fw.close();
            System.out.println("파일의 내용이 작성되었습니다.");

        } catch (IOException e) {
            System.out.println("글자 작성에 실패했습니다. 다시 작성해주세요.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }

    }

}
