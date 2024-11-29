package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritePre {
    public static void main(String[] args) {
        // 바탕화면에 hello.txt 만들고
        // 안녕하세요 Hello Hi
        // 작성 후 파일을 닫고 프로그램 종료
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        File file = new File(path + "hello.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("파일이 생성되었습니다.");
            } else {
                System.out.println("파일이 존재합니다.");
                return; // 덮어쓰기 방지
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
            return;
        }

        try {
            FileWriter fw = new FileWriter(file);
            String content = "안녕하세요. \nHello \nHi";

            fw.write(content);
            fw.close();
            System.out.println("파일에 내용이 작성되었습니다.");

        } catch (IOException e) {
            System.out.println("글자 작성에 실패했습니다. 다시 시도해주세요.");
        } finally {
            System.out.println("글쓰기 작성을 종료합니다.");
        }

    }
}
