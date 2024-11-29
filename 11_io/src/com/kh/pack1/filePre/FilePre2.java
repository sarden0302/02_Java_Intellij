package com.kh.pack1.filePre;

import java.io.File;
import java.text.SimpleDateFormat;

public class FilePre2 {
    // method1 :
    //
    public void method1() {
        String folderPath = "D://Leo/SoftwareEngineering/front-workspace/01_HTML";
        System.out.println("폴더 경로 확인 : " + folderPath);
        File file = new File("D://Leo/SoftwareEngineering/front-workspace/01_HTML");

        System.out.println("폴더 위치 : " + file.getPath());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        File[] files = file.listFiles();

        assert files != null;
        for (File f : files) {
            System.out.println("f.toString [파일 경로 + 파일 이름] : " + f.toString());
            System.out.println("파일 이름 : " + f.getName());
            System.out.println("마지막 수정 날 짜 : " + sdf.format(f.lastModified()));
        }

    }
}
