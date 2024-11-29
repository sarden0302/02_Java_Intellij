package com.kh.pack2.pre2;

import java.io.*;
import java.util.Scanner;

public class FileWritePre {
    private File file = null;

    /*
        createTxt(path, fileName)
        @param path     : 파일 경로
        @param fileName : 파일 이름
        @return         : 파일 생성을 실패했을 경우
     */
    public void createTxt(String path, String fileName) {
        file = new File(path + fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("파일을 성공적으로 생성하였습니다.");
                return;
            } catch (IOException e) {
                System.out.println("예기치 못한 에러가 발생하여 생성하지 못하였습니다.");
            }
        }
        System.out.println("파일이 이미 존재합니다. 생성 실패");
    }

    /*
        createTxt(path, fileName)
        @param path     : 파일 경로
        @param fileName : 파일 이름
        @return         : 파일 생성을 실패했을 경우
     */
    public void writeTxt(String path, String fileName) {
        file = new File(path + fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            FileWriter fw = new FileWriter(file, true);
            System.out.print("이름 : ");
            String line = "이름은 " + br.readLine() + "입니다.\n";
            System.out.print("성함 : ");
            line += "성함은 " + br.readLine() + "입니다.\n";
            System.out.print("연락처 : ");
            line += "연락처는 " + br.readLine() + "입니다\n";

            fw.write(line);
            br.close();
            fw.close();
            System.out.println("성공적으로 파일 내 작성하였습니다.");
        } catch (IOException e) {
            System.out.println("예기치 못한 변수가 발생하였습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }

    }
}
