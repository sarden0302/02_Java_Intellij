package com.kh.pack1.fileEx;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    // 특정 위치 폴더에 있는 모든 파일과 폴더를 배열 형태로 가져오기
    public void method3() {
        System.out.println("확인하고자 하는 폴더 경로 : " + System.getProperty("user.home") + "/OneDrive/Desktop");

        // 특정 위치 폴더에 있는 모든 파일과 폴더를 배열 형태로 가져오기
        // Ctrl + F 를 통해 경로내 \ 를 / 로 변경
        File file = new File("C:/Users/sarde/Downloads");

        File[] files = file.listFiles();

        //File을 통해 파일 개수를 불러올 때 length로 가져오면 시간이 더 걸림
        for (File f : files) {
            System.out.print("파일 이름 : " + f.getName());
            System.out.println((f.isDirectory()) ? " <div>" : "");
            System.out.println("파일 크기 : " + f.length() + "bytes");
            System.out.println("마지막 수정 날짜 : " + f.lastModified());
            // 마지막 수정 날짜 : 1731916790202 = 1970.01.01 09:00부터 지난 일자
            // 마지막 수정 날짜 형식 변환
            long lastModified = f.lastModified();
            Date date = new Date(lastModified);
            //1731916790202 의 숫자로 받기 때문에 long으로 받아야된다.
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            //날짜 형식을 문자열 형식으로 변환
            System.out.println("SimpleDateFormat 활용 시간 변경 : " + sdf.format(f.lastModified()));
            System.out.println("Date 활용 시간 변경 : " + sdf.format(date));
        }
    }
}
