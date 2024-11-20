package com.kh.practice.func;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class OperatorPractice {
    Scanner sc = new Scanner(System.in);

    public void practice1() {
        try {
            System.out.print("Enter the number : ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);

            if (number > 0) {
                System.out.println("양수다");
                return;
            }

            System.out.println("양수가 아니다");

        } catch(Exception e) {
            System.out.println("정수로 작성해주세요");
            practice1();
        }
    }

    public void practice2() {
        try {
            System.out.print("Enter the number : ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);

            if (number > 0) {
                System.out.println("양수다");
                return;
            }

            if (number == 0) {
                System.out.println("0입니다");
                return;
            }

            System.out.println("양수가 아니다");

        } catch(Exception e) {
            System.out.println("정수로 작성해주세요");
            practice2();
        }
    }

    public void practice3() {
        try {
            System.out.print("Enter the number : ");
            String input = sc.nextLine();
            int number = Integer.parseInt(input);

            if (number < 0) {
                throw new NumberFormatException();
            }
            if (number % 2 == 0) {
                System.out.println("짝수입니다.");
                return;
            }
            System.out.println("홀수입니다.");
        } catch (Exception e) {
            System.out.println("0이상 정수로 입력해주세요.");
            practice3();
        }
    }

    public void practice4() {
        try {
            System.out.print("인원 수 : ");
            String input1 = sc.nextLine();
            int peopleNumber = Integer.parseInt(input1);

            System.out.print("인원 수 : ");
            String input2 = sc.nextLine();
            int candyNumber = Integer.parseInt(input2);

            if (peopleNumber < 0 || candyNumber < 0) {
                throw new NumberFormatException();
            }

            System.out.println("1인당 사탕 개수 : " + (candyNumber / peopleNumber));
            System.out.println("남는 사탕 개수 : " + (candyNumber % peopleNumber));

        } catch (Exception e) {
            System.out.println("인원 수와 사탕 개수 입력이 잘못됐습니다. 다시 입력해주세요.");
            practice4();
        }
    }

    public void practice5() {
        Map hm = new HashMap();
        hm.put(1, "M");
        hm.put(2, "F");
        try {
            System.out.print("이름 : ");
            String inputName = sc.nextLine();
            System.out.print("학년(숫자만) : ");
            int degree = Integer.parseInt(sc.nextLine());
            System.out.print("반(숫자만) : ");
            int classroom = Integer.parseInt(sc.nextLine());
            System.out.print("번호(숫자만) : ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.print("성별(M/F) : ");
            String gender = sc.nextLine();
            if (!hm.containsValue(gender)) {
                throw new NumberFormatException();
            }
            System.out.print("성적(소수점 아래 둘째자리까지 : ");
            float grade = Float.parseFloat(sc.nextLine());

            System.out.println(degree + "학년 " + classroom + "반 " + number + "번 " + inputName + ((gender.equals("M"))? " 남학생" : " 여학생") + "의 성적은 " + grade + "이다.");
        } catch (Exception e) {
            System.out.println("잘못 입력하셨습니다.");
            practice5();
        }
    }

    public void practice6() {
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());
        if (age < 0) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        if (age > 19) {
            System.out.println("어른");
            return;
        }
        if (age >= 13) {
            System.out.println("청소년");
            return;
        }
        System.out.println("어린이");
    }
    
    public void practice7() {
        System.out.print("국어 : ");
        int kor = Integer.parseInt(sc.nextLine());
        System.out.print("영어 : ");
        int eng = Integer.parseInt(sc.nextLine());
        System.out.print("수학 : ");
        int math = Integer.parseInt(sc.nextLine());
        
        int total = kor + eng + math;
        double average = (float)total / 3.0;

        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);
        
        boolean pass = true;
        if (kor < 40 || eng < 40 || math < 40) pass = false;
        if (average < 60) pass= false;
        System.out.println((pass) ? "합격" : "불합격");
    }

    public void practice8() {
        String REGEXP_ID = "\\d{6} \\- [1-4]\\d{6}";
        try {
            System.out.print("주민번호를 입력하세요(- 포함) : ");
            String identification = sc.nextLine();
            if (identification.matches(REGEXP_ID)) {
                throw new NumberFormatException();
            }
            StringTokenizer st = new StringTokenizer(identification, "-");
            String str = st.nextToken();
            str = st.nextToken();
            if (str.charAt(0) == '1') {
                System.out.println("남성입니다.");
                return;
            }
            System.out.println("여성입니다.");

        } catch (Exception e) {
            System.out.println("형식에 맞게 작성해주세요");
            practice8();
        }
    }

    public void practice9() {
        try {
            System.out.print("정수1 : ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("정수2 : ");
            int num2 = Integer.parseInt(sc.nextLine());
            if (num1 > num2) {
                throw new ClassNotFoundException();
            }
            System.out.print("입력 : ");
            int num3 = Integer.parseInt(sc.nextLine());

            if (num3 <= num1 || num3 > num2) {
                System.out.println(true);
                return;
            }
            System.out.println(false);

        } catch (NumberFormatException e) {
            System.out.println("정수만 입력하세요 님아");
            practice9();
        } catch(ClassNotFoundException e) {
            System.out.println("정수1이 정수2보다 작아야합니다");
            practice9();
        }

    }

    public void practice10() {
        try {
            System.out.print("정수1 : ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("정수2 : ");
            int num2 = Integer.parseInt(sc.nextLine());
            System.out.print("입력 : ");
            int num3 = Integer.parseInt(sc.nextLine());

            if (num3 == num1 && num3 == num2) {
                System.out.println(true);
                return;
            }
            System.out.println(false);
        } catch (NumberFormatException e) {
            System.out.println("정수만 입력하세요 님아");
            practice10();
        }
    }

    public void practice11() {
        try {
            System.out.print("A사원의 연봉 : ");
            float a = Float.parseFloat(sc.nextLine());
            System.out.print("B사원의 연봉 : ");
            float b = Float.parseFloat(sc.nextLine());
            System.out.print("C사원의 연봉 : ");
            float c = Float.parseFloat(sc.nextLine());

            double aTotal = a * 1.4;
            double cTotal = c * 1.15;
            System.out.println("A사원 연봉/연봉+a : " + a + "/" + aTotal);
            System.out.println((aTotal >= 3000) ? "3000이상" : "3000미만");
            System.out.println("B사원 연봉/연봉+a : " + b + "/" + b);
            System.out.println((b >= 3000) ? "3000이상" : "3000미만");
            System.out.println("A사원 연봉/연봉+a : " + c + "/" + cTotal);
            System.out.println((cTotal >= 3000) ? "3000이상" : "3000미만");


        } catch(Exception e) {
            System.out.println("니 연봉도 제대로 못 적니 걍 들어가라.");
            practice11();
        }
    }
}
