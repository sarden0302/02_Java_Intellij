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
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.println(num1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.print("2. 정수 입력 : ");
        String str = br.readLine();
        br.close();
        bw.write(str);
        bw.flush();
        bw.close();

    }
}
