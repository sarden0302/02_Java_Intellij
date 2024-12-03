package com.kh.throwsExceptionPre;

import java.io.*;

public class ThrowsPre {

    // 1. try 대신 throws IOExeption 작성하기
    public void method1() throws IOException {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String fileName = "여행지도";
        String extName = ".docs";

        // C://Users/user1/Desktop/여행지도.docs
        File f = new File(path + fileName + extName);

        f.createNewFile();
        System.out.println("파일 생성이 완료되었습니다.");

        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);

        String content = "안녕하세요.\n";
        bw.write(content);
        bw.close();
    }

    // 2. try 대신 throws Exception 작성하고 에러 확인하기
    //
    public void method2() throws Exception {//main에 보내는
        FileReader fr = new FileReader(System.getProperty("user.home" + "OneDrive/Desktop/" + "여행지도" + ".docs"));
        String line = fr.toString();
        System.out.println(line);
    }

}
