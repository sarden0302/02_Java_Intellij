package com.kh.pack2.pre;

import java.io.File;

public class FileWriterPre5Run {

    public static void main(String[] args) {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String fileName = "food.txt";
        FileWriterPre5  fwp5 =  new FileWriterPre5();

        fwp5.createFile(path, fileName);
        fwp5.writeFile(path, fileName);

        // 파일 생성하기 기능;

    }
}
