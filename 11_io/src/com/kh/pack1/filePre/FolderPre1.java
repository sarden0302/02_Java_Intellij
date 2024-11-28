package com.kh.pack1.filePre;

import java.io.File;
import java.io.IOException;

public class FolderPre1 {

    // method1 : 바탕화면에 profileImg 폴더가 존재하는지 확인
    //          존재하지 않을 시 생성
    //          이미 존재 시 : 존재하는 폴더 출력
    public void method1() {
        File folder = new File(System.getProperty("user.home") + "/OneDriveSt/Desktop/profileImg");

        System.out.println("폴더 위치 : " + folder.getPath());
        System.out.println("폴더 절대경로 : " + folder.getAbsolutePath());
        //폴더 절대경로 : D:\newFolder
        System.out.println("폴더 이름 : " + folder.getName());
        System.out.println("폴더가 존재하는지 확인 : " + folder.exists());



        if (folder.exists()) {
            System.out.println("존재하는 폴더");
            return;
        }
        folder.mkdir();
        System.out.println("새로운 파일이 생성되었습니다.");

    }

    public void method2() {
        File file = new File("C:/Users/sarde/OneDrive/Desktop/newFile.txt");

        if (file.exists()) {
            System.out.println("이미 바탕화면에 존재하는 파일입니다. " + file);
            return;
        }
        try {
            file.createNewFile();
            System.out.println("파일이 성공적으로 생성되었습니다. " + file);
        } catch (IOException e) {
            System.out.println("파일 생성 중 예기치 못한 문제가 발생했습니다.");
        }
    }
}
