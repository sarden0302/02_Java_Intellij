package com.kh.pack1.fileEx;

import java.io.File;
import java.io.IOException;

public class FileService {
    // File class 객체를 이용하는 폴더가 존재하지 않으면 폴더 생성
    public void method1() {
        // 만약에 바탕화면에 만들고 싶다면
        File 폴더 = new File("C://Users/sarde/OneDriveSt/Desktop/newFolders");

        System.out.println("폴더 위치 : " + 폴더.getPath());
        System.out.println("폴더 절대경로 : " + 폴더.getAbsolutePath());
        //폴더 절대경로 : D:\newFolder
        System.out.println("폴더 이름 : " + 폴더.getName());
        System.out.println("폴더가 존재하는지 확인 : " + 폴더.exists());
         // 폴더 생성
        폴더.mkdir();

        if (폴더.exists()) {
            System.out.println("이미 존재하는 폴더입니다.");
        } else {
            System.out.println("폴더 생성을 완료했습니다.");
        }

    }

    public void method2() {
        File file = new File("C:/Users/sarde/OneDrive/Desktop/내파일.txt");

        if (file.exists()) {
            System.out.println("이미 바탕화면에 존재하는 파일입니다.");
            return;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("파일이 성공적으로 생성되었습니다.");
    }
}
