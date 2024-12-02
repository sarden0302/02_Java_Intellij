package com.kh.pack2.pre4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTrue {

    public void writeTxt() {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        Scanner scanner = new Scanner(System.in);
        System.out.print("내용을 이어서 작성할 파일명을 입력하세요 : ");
        String fileName = scanner.nextLine();

        // .txt를 넣어줌으로써 파일 이름만 받을 수 있다
        File file = new File(path + fileName + ".txt");

        //만약에 파일이 존재하지 않는다면 파일이 존재하지 않습니다
        // 파일을 생성하려면 Yes를 입력하고 원하지 않을 시 아무 글자 입력
        if (!file.exists()) {
            System.out.print(fileName + " 파일 생성을 원하신가요? (Yes 입력시 생성) : ");
            String yesOrNo = scanner.nextLine();
            if (!yesOrNo.equalsIgnoreCase("Yes") && !yesOrNo.equalsIgnoreCase("y")) {
                System.out.println("메인화면으로 돌아갑니다.");
                return;
            }
            try {
                file.createNewFile();
                System.out.println("파일이 생성되었습니다. " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("파일 생성에 문제가 생겼습니다.");
            }
        }

        // 파일생성까지 됏다면 파일 안에 글 작성
        // try with resources 안에 1가지 코드만 작성시 ; 생략 가능
        // 2가지 이상 작성시 ;로 구분
        try (FileWriter fw = new FileWriter(path + fileName + ".txt", true)){
            // exit 입력시 종료
                // while 문 이용해서 exit 입력 전까지 글 내용 작성
            System.out.println(file + "안에 들어갈 내용 ");
            System.out.println("[작성 구문] (종료를 원할 경우 exit 입력");
            while (true) {
                String input = scanner.nextLine();
                /* "\r\n"
                    \r : 키보드 커서를 현재 줄의 맨 앞으로 이동시키는 역할
                    예를 들어 \naver 와 같은 상황이 발생할 경우를 방지하기 위해 커서를 기본적으로 맨 앞으로 보내서
                    \n을 활용하셔 줄바꿈처리를 할 수 있도록 설정
                 */
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("글 작성을 종료합니다");
                    return;
                }
                fw.write(input + "\r\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
