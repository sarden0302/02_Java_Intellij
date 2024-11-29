package com.kh.pack2.pre;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterPre5 {
    /*
        createFile(String path, String fileName)
        @param path     : 파일 경로
        @param fileName : 파일 이름
        @return         : 파일 생성을 실패했을 경우
     */
    public void createFile(String path, String fileName) {
        File file = new File(path + fileName);

        if (file.exists()) {
            System.out.println("File already exists : " + fileName);
        } else {
            try {
                file.createNewFile();
                System.out.println("File created : " + fileName);
            } catch (IOException e) {
                System.out.println("File could not be created : " + fileName);
            }
        }
    }

    /* writeFile(File file)
    * @param path 파일 경로
    * @param fileName 파일 이름
    * */
    public void writeFile(String path, String fileName) {
        File file = new File(path + fileName);

        if (!file.exists()) {
            System.out.println("File does not exists : " + fileName);
            return;
        }

        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter(file, true);
            System.out.print("작성할 내용을 입력하세요 : ");
            String input = sc.nextLine();
            fw.write(input);

            fw.close();
        } catch (IOException e) {
            System.out.println("File could not be created : " + fileName);
        }  finally {
            sc.close();
            System.out.println("File written : " + fileName);
        }

    }


}
