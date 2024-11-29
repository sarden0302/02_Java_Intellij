package com.kh.pack2.pre3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    //method1 텍스트 파일을 읽고 출력
    public void method1() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home") + "/OneDrive/Desktop/happyLunch.txt"));
            String line = null;
            int count = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }
            System.out.println("총 line 은 " + count + "줄 입니다.");
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
