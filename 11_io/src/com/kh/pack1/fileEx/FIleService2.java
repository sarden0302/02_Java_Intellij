package com.kh.pack1.fileEx;

public class FIleService2 {
    //System.getProperty()
    public void method1() {
        // 특정시스탬의 속성 정보를 가져오는데 사용하는 기능
        /*
        System.getProperty();
            java.version    자바 version
            java.home       Java가 설치된 경로
            os.name         windows/Linux/macOS 인지 확인
            user.name       현재 컴퓨터를 사용하는 사용자 이름
            user.home       현재 사용자 홈 폴더 경로
            user.div        현재 작업하고 있는 폴더
         */
        String a = System.getProperty("user.home");
        System.out.println(a);
        System.out.println(System.getProperty("user.home"));

        // 운영체제 정보 출력
        String osName = System.getProperty("os.name");
        System.out.println("운영체제 이름 : " + osName);

        String name = System.getProperty("user.name");
        System.out.println("user 이름 : " + name);
        // 사용자 정보
    }
}
