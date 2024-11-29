package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPre4 {
    // menu.txt
    // 파일 존재 유무 확인 && 존재 시 이어쓰기
    // \n떡볶이, 순대, 마라탕 주문하기

    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        File file = new File(path + "menu.txt");

        if (file.exists()) {
            System.out.println("파일이 이미 존재합니다.");
        } else {
            try {
                file.createNewFile();
                System.out.println("파일이 생성되었습니다.");
            } catch (IOException e) {
                System.out.println("예기치 못한 변수 생성");
            }
        }


        try {
            FileWriter fw = new FileWriter(file, true);
            String content = "\n떡볶이, 순대, 마라탕";
            fw.write(content);
            fw.close();
            System.out.println("성공적으로 이어쓰기 완료했습니다.");
        } catch (IOException e) {
            System.out.println("예외 발생!");
        }
    }

}
