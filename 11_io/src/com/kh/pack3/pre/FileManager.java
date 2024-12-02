package com.kh.pack3.pre;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    /* 파일을 생성하는 기능
        createFile(path, fileName)
        @param path           : 파일 경로
        @param createFileName : 생성할 파일 이름
        @return               : 파일 생성을 실패했을 경우
     */
    public void createFile(String path, String createFileName) {
        File file = new File(path + createFileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("파일이 현재 존재하지 않으므로 파일을 새로 생성합니다.");
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("파일이 이미 존재합니다.");
    }

    /*      파일을 읽는 기능
            readFile(path, readFileName)
            @param path          : 파일 경로
            @param readFileName  : 읽을 파일 이름
            @return              : 파일 생성을 실패했을 경우
     */
    public void readFile(String path, String readFileName) throws IOException {
        File file = new File(path + readFileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다. 메인화면으로 돌아갑니다.");
            return;
        }
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path + readFileName));
            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다. 메인화면으로 돌아갑니다.");
        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다. 메인화면으로 돌아갑니다. ");
        } finally {
            br.close();
        }

    }

    /*      파일을 작성할 기능(이어쓰기 가능)
            writeToFile(path, writeFileName)
            @param path          : 파일 경로
            @param writeFileName : 이어쓰기할 파일 이름
            @return              : 파일 생성을 실패했을 경우
     */

    /*
    public void writeToFile(String path, String writeFileName) throws IOException {
        File file = new File(path + writeFileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다. 메인 화면으로 돌아갑니다.");
            return;
        }

        try(FileWriter fw = new FileWriter(new File(path + writeFileName), true);) {
             // true : 이어쓰기 / false : 덮어쓰기(default)
            Scanner sc = new Scanner(System.in);
            System.out.print("작성해주세요 : ");
            String content = sc.nextLine();
            fw.write("\n" + content);

        } catch (IOException e) {
            System.out.println("파일이 존재하지 않습니다. 메인화면으로 돌아갑니다");
            return;
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }

    public void writeToFile(String path, String writeFileName) throws IOException {
        File file = new File(path + writeFileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다. 메인 화면으로 돌아갑니다.");
            return;
        }

        try(FileWriter fw = new FileWriter(new File(path + writeFileName), true);
            Scanner sc = new Scanner(System.in);
        ) {
            System.out.println("작성하기를 원치 않는다면 'exit' 입력");
            // 만약에 exit라는 문자가 들어오면 종료하기 기능 설정
            while (true) {
                System.out.print("작성해주세요 : ");
                String content = sc.nextLine();
                if (content.equals("exit")) {
                    break;
                }
                fw.write(content);
            }
            System.out.println("이어쓰기 작성을 완료했습니다.");
        } catch (IOException e) {
            System.out.println("파일이 존재하지 않습니다. 메인화면으로 돌아갑니다");
            return;
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }*/
    public void writeToFile(String path, String writeFileName) throws IOException {
        File file = new File(path + writeFileName);
        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다. 메인 화면으로 돌아갑니다.");
            return;
        }

        try (FileWriter fw = new FileWriter(file, true);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("작성해주세요 : ");
            String content = br.readLine();
            fw.write(content);

            System.out.println("이어쓰기 작성을 완료했습니다.");
        } catch (IOException e) {
            System.out.println("파일 작성 중 에러가 발생했습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
}
