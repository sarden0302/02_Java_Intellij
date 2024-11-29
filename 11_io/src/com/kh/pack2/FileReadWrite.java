package com.kh.pack2;

import java.io.*;

public class FileReadWrite {
    // 파일을 바탕화면에 만들고 파일 안에 글자 작성하기
    public void method1() {
        File file = new File(System.getProperty("user.home") + "/OneDrive/Desktop/ex1.txt");
        try {
            if (file.exists()) {
                System.out.println("파일이 존재합니다.");
            } else { // 파일이 존재하지 않는 경우 파일 생성
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("파일 만들기에 실패했습니다.");
        }
        //생성된 파일 글자를 작성
        try { // 파일 안에 글을 작성 중 에러 발생이 가능해서 try - catch를 통해 예외처리 해줘야한다.
            FileWriter writer = new FileWriter(file);
            String content = "안녕하세요. 반갑습니다. 환영해요.";
            writer.write(content);
            writer.close(); // close 안할 시 내용 저장이 안된다.
            System.out.println("파일에 내용이 작성되었습니다.");
        } catch (IOException e) {
            System.out.println("글자 작성에 실패했습니다. 다시 시도해주세요.");
        } finally {
            System.out.println("글쓰기 작성을 종료합니다.");
        }
    }

    // 만들어진 파일에 이어서 글자 작성하기 (feat. FileWriter)
    // FileWriter fw = new FileWriter("파일명", true)
    //               -> 기본적으로 false로 덮어쓰기 진행 // true일 시 이어쓰기 모드
    public void method2() {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        File file = new File(path + "hello.txt");

        //FileWriter를 이용해서 이어쓰기 진행
        try {
            FileWriter fw = new FileWriter(file, true);

            String content = "\n이어서 작성한 내용입니다.";
            fw.write(content);
            fw.close();
            System.out.println("파일 이어서 작성하기를 완료했습니다.");
        } catch (IOException e) {
            System.out.println("이어서 작성하는 것을 실패했습니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

    // 만들어진 파일을 읽고 눈으로 어떤 내용이 작성되어 있는지 확인
    // FileReader           : 파일로부터 문자 데이터를 읽어들이는 클래스       -> 한 글자씩 읽음
    // BufferedReader       : FileReader에 버퍼링 기능 추가한 클래스        -> 한 줄 단위로 읽음
    //                        줄 단위로 데이터를 읽을 수 있어 빠르고 성는이 좋다
    // Buffering : 데이터를 가져오는 것 (실패시 버퍼링 중단되었다)
    // Streaming : String을 출력 중
    public void method3() {
        try {
            FileReader file = new FileReader(System.getProperty("user.home") + "/OneDrive/Desktop/user.txt");
            BufferedReader br = new BufferedReader(file); // 한 줄 단위로 읽는 성능 좋은 클래스
            String line = br.readLine(); // 한 줄씩 읽어오는 readLine()기능 설정
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            file.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method4() {
        try {
            FileReader file = new FileReader(System.getProperty("user.home") + "/OneDrive/Desktop/user.txt");
            BufferedReader br = new BufferedReader(file); // 한 줄 단위로 읽는 성능 좋은 클래스
            String line = br.readLine(); // 한 줄씩 읽어오는 readLine()기능 설정
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            file.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
