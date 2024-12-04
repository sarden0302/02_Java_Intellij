package finalProblem;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FinalProblem {
    private Scanner scanner = new Scanner(System.in);

    public void method1() {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result += numbers[i];
            }
        }
        System.out.println("홀수 값의 합 : " + result);
    }

    public void method2() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Eve");

        for (String name : names) {
            /*
                startsWith(String prefix)   : prefix = 접두사
                    ex) boolean startWord = name.startsWith("A");
                endWith(String suffix)      : suffix = 접미사
                    ex) boolean endWord = name.endWith("s");
             */
            if (name.charAt(0) == 'A') {
                System.out.println(name);
            }
        }
    }

    public void method3() {
        try {
            System.out.print("a : ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("b : ");
            int b = Integer.parseInt(scanner.nextLine());
            if (b == 0) {
                throw new Exception();
            }
            System.out.println("결과 : " + (a / b));
        } catch (NumberFormatException e) {
            System.out.println("잘못된 형식입니다");
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }

    public void method5() {
        File numberFile = new File(System.getProperty("user.home") + "/OneDrive/Desktop/number.txt");

        File resultFile = new File(System.getProperty("user.home") + "/OneDrive/Desktop/result.txt");

        if (!numberFile.exists()) {
            System.out.println("number.txt 파일이 존재하지 않습니다.");
            return;
        }
        if (!resultFile.exists()) {
            try {
                resultFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        int result = 0;
        // FileWriter FileReader BufferedReader는 try 내부에 있어야한다.
        try (BufferedReader br = new BufferedReader(new FileReader(numberFile))) {

            String input = br.readLine();
            while (input != null) {
                result += Integer.parseInt(input);
                input = br.readLine();
            }
            System.out.println("result : " + result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fw = new FileWriter(resultFile);
            FileWriter fw2 = new FileWriter(numberFile)
        ) {
            fw.write(String.valueOf(result));
            fw2.write(String.valueOf(result));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void method7() {
        System.out.print("a : ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("b : ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("합 : " + (a + b));
        System.out.println("차 : " + (a - b));
        System.out.println("곱 : " + (a * b));
        try {
            System.out.println("몫 : " + (a / b));
        }  catch (Exception e) {
            System.out.println("Cannot divide by zero");

        }
        System.out.println("나머지 : " + (a % b));
    }
}
