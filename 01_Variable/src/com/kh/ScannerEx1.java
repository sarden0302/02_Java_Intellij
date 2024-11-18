package com.kh;

import java.io.*;
import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) throws IOException {
        /*
        * import java.util.Scanner;
        * Scanner sc = new Scanner(System.in);
        *
        * Scanner.next() : 단어(String) 1개 입력 공백 문자 입력 시 입력 종료
        * Scanner.nextLine() : 문자열(Strgin) 1개 입력 엔터(개행 문자) 입력 시 종료
        * Scanner.nextInt() : int형 정수 1개 입력
        * Scanner.nextLong() : long형 정수 1개 입력
        * Scanner.nextDouble() : double형 실수 1개 입력
        *
        * **** 주의 사항 *****
        * next() / nextInt() / nextDouble() 작성 후
        * nextLine() 작성시 nextLine() 구문을 미리 한번 작성
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println(num1);

        System.out.print("정수 입력2 : ");
        int num2 = sc.nextInt();

        System.out.print("실수 입력 : ");
        double num3 = sc.nextDouble();
        System.out.println("num2에서 가져온 정수는 " + num2);
        System.out.println("num3에서 가져온 정수는 " + num3);

        System.out.print("단어를 2가지 입력하세요 : ");
        String fruit1 = sc.next();
        String fruit2 = sc.next();

        System.out.println("단어 두가지 출력하기 : " + fruit1 + " and " + fruit2);


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.print("BufferedReader 사용\n 정수입력 : ");
        String str = br.readLine();
        br.close();
        bw.write(str);
        bw.flush();
        bw.close();
        System.out.println("git connected!");
    }
}
