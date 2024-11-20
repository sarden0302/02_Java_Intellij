package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
    Scanner sc = new Scanner(System.in);
    public void practice1() {
        int index = 0;
        try {
            while(index != 7) {
                System.out.println("1. 입력");
                System.out.println("2. 수정");
                System.out.println("3. 조회");
                System.out.println("4. 삭제");
                System.out.println("7. 종료");
                System.out.print("메뉴 번호를 입력하세요 : ");
                index = Integer.parseInt(sc.nextLine());
                switch(index) {
                    case 1:
                        System.out.println("입력 메뉴입니다.");
                        break;
                    case 2:
                        System.out.println("수정 메뉴입니다.");
                        break;
                    case 3:
                        System.out.println("조회 메뉴입니다.");
                        break;
                    case 4:
                        System.out.println("삭제 메뉴입니다.");
                        break;
                    case 7:
                        System.out.println("종료 메뉴입니다.");
                        break;
                    default:
                        System.out.println("보기에 없습니다. 메인 화면으로 돌아갑니다.");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("정수만 입력하세요 (1 ~ 4 or 7)");
            practice1();
        }

    }

    public void practice2() {
        try {
            System.out.print("숫자를 한 개 입력하세요. : ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("양수가 아니다");
                return;
            }

            if (number % 2 == 0) {
                System.out.println("짝수다");
                return;
            }
            System.out.println("홀수다");

        } catch(Exception e) {
            System.out.println("정수로 작성해주세요");
            practice2();
        }
    }

    public void practice3() {
        System.out.print("국어점수 : ");
        int kor = Integer.parseInt(sc.nextLine());
        System.out.print("수학점수 : ");
        int math = Integer.parseInt(sc.nextLine());
        System.out.print("영어점수 : ");
        int eng = Integer.parseInt(sc.nextLine());

        int total = kor + eng + math;
        double average = (float)total / 3.0;

        boolean pass = true;
        if (kor < 40 || eng < 40 || math < 40) pass = false;
        if (average < 60) pass= false;
        if (!pass) {
            System.out.println("불합격입니다.");
            return;
        }
        System.out.println("국어 : " + kor);
        System.out.println("수학 : " + math);
        System.out.println("영어 : " + eng);
        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);

        System.out.println("축하합니다, 합격입니다!");
    }

    public void practice4() {
        try {
            System.out.print("1~12 사이의 정수 입력 : ");
            int season = Integer.parseInt(sc.nextLine());
            switch(season) {
                case 3: case 4: case 5:
                    System.out.println(season + "월은 봄입니다.");
                    break;
                case 6: case 7: case 8:
                    System.out.println(season + "월은 여름입니다.");
                    break;
                case 9: case 10: case 11:
                    System.out.println(season + "월은 가을입니다.");
                    break;
                case 12: case 1: case 2:
                    System.out.println(season + "월은 겨울입니다.");
                    break;
                default:
                    System.out.println(season + "월은 잘못 입력한 달입니다.");
                    break;
            }

        } catch(NumberFormatException e) {
            System.out.println("정수만 입력해주세요.");
            practice4();
        }
    }

    public void practice5() {
        System.out.print("아이디 : ");
        String userId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String userPw = sc.nextLine();

        if (!userId.equals("myId")) {
            System.out.println("아이디가 틀렸습니다.");
            return;
        }

        if (!userPw.equals("myPassword12")) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }

        System.out.println("로그인 성공");
    }

    public void practice6() {
        String input = "";
        try {
            System.out.print("권한을 확인하고자 하는 회원 등급 : ");
            input = sc.nextLine();
            if (!input.equals("관리자") && !input.equals("회원") && !input.equals("비회원")) {
                throw new Exception();
            }

            if (input.equals("관리자")) {
                System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
                return;
            }

            if (input.equals("회원")) {
                System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
                return;
            }

            System.out.println("게시글 조회");
            return;

        } catch  (Exception e) {
            System.out.println("관리자, 회원, 비회원 중 입력하세요");
            practice6();
        }
    }

    public void practice7() {
        try {
            System.out.print("키(m)를 입력해 주세요 : ");
            float height = Float.parseFloat(sc.nextLine());
            System.out.print("몸무게(kg)를 입력해 주세요 : ");
            float weight = Float.parseFloat(sc.nextLine());
            double bmi = weight/(height * height);

            System.out.println("BMI 지수 : " + bmi);

            if (bmi < 18.5) {
                System.out.println("저체중");
                return;
            }

            if (bmi < 23) {
                System.out.println("정상체중");
                return;
            }

            if (bmi < 25) {
                System.out.println("과체중");
                return;
            }

            if (bmi < 30) {
                System.out.println("비만");
                return;
            }
            System.out.println("고도 비만");

        } catch(NumberFormatException e) {

        }
    }

    public void practice8() {
        try {
            System.out.print("피연산자1 입력 : ");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.print("피연산자2 입력 : ");
            int num2 = Integer.parseInt(sc.nextLine());
            System.out.print("연산자를 입력(+, -, *, /, %)");
            String operation = sc.nextLine();
            float result = 0;
            switch(operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = (float)num1 / num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                default:
                    throw new Exception();
            }
            System.out.printf(num1 + operation + num2 + " = %.6f", result);


        } catch(NumberFormatException e) {
            System.out.println("정수만 입력해주세요.");
            practice8();
        } catch(Exception e) {
            System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
            practice8();
        }
    }

    public void practice9() {
        try {
            System.out.print("중간 고사 점수 : ");
            int midterm = Integer.parseInt(sc.nextLine());
            System.out.print("기말 고사 점수 : ");
            int finalExam = Integer.parseInt(sc.nextLine());
            System.out.print("과제 점수 : ");
            int assignmentScore = Integer.parseInt(sc.nextLine());
            System.out.print("출석 회수 : ");
            int attendanceScore = Integer.parseInt(sc.nextLine());

            System.out.println("================= 결과 =================");
            System.out.printf("중간 고사 점수(20) : %.1f", (float)midterm / 20);
            System.out.printf("기말 고사 점수(20) : %.1f", (float)finalExam / 30);
            System.out.printf("과제 점수       (30) : %.1f", (float)assignmentScore / 30);
            System.out.printf("출석 점수       (20) : %.1f", (float)assignmentScore / 30);
        } catch (Exception e) {
            System.out.println("형식에 맞게 작성해주세요.");
            practice9();
        }
    }

    public void practice11() {

        try {
            System.out.print("비밀번호 입력(1000 ~ 9999) :");
            String password = sc.nextLine();
            int test = Integer.parseInt(password);
            if (password.length() != 4 || password.charAt(0) == '0') {
                System.out.println("자리수 안맞음");
                return;
            }
            if (password.equals("5685")) {
                System.out.println("중복 값 있음");
                return;
            }
            System.out.println("성공");

        } catch (Exception e) {
            System.out.println("숫자로만 입력하세요.");
        }

    }


}
