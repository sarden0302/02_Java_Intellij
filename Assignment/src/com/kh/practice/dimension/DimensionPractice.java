package com.kh.practice.dimension;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DimensionPractice {
    Scanner sc = new Scanner(System.in);

    public void practice1() {
        String[][] arr = new String[3][3];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = "(" + row + "," + col + ")";
            }
        }
        for (String[] str : arr) {
            System.out.print(str[0]+ str[1] + str[2]);
            System.out.println();
        }

    }

    public void practice2() {
        int[][] arr = new int[4][4];
        int count = 1;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                arr[row][col] = count;
                count++;
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void practice3() {
        int[][] arr = new int[4][4];
        int count = 16;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                arr[row][col] = count;
                count--;
            }
        }
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void practice4() {
        int[][] arr = new int[4][4];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = (int)(Math.random()*10) + 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
            arr[3][i] = arr[0][i] + arr[1][i] + arr[2][i];
        }
        arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2] + arr[0][3] + arr[1][3] + arr[2][3];

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void practice5() {
        try {
            System.out.print("행 크기 : ");
            int row = Integer.parseInt(sc.nextLine());
            System.out.print("열 크기 : ");
            int col = Integer.parseInt(sc.nextLine());
            if (row < 1 || col < 1 || row > 10 || col > 10) {
                throw new Exception();
            }
            char[][] alphabet = new char[row][col];
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    alphabet[i][j] = (char)((int)(Math.random() * 25) + 65);
                    System.out.print(alphabet[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
            practice5();
        }
    }

    public void practice6() {
        String[][] strrArr = new String[][] {{"이", "까", "왔", "앞", "힘"},
                {"차", "지", "습", "으", "냅"},
                {"원", "열", "니", "로", "시"},
                {"배", "심", "다", "좀", "다"},
                {"열", "히", "!", "더", "!! "}};
        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {
                System.out.print(strrArr[row][col] + " ");
            }
        }
    }

    public void practice7() {
        try {
            System.out.print("행의 크기 : ");
            int row = Integer.parseInt(sc.nextLine());
            if (row < 1) {
                throw new Exception();
            }

            ArrayList<Character>[] alphabetArr = new ArrayList[row];

            for (int i = 0; i < row; i++) {
                alphabetArr[i] = new ArrayList<>();
                System.out.print(i + "행의 열 크기 : ");
                int col = Integer.parseInt(sc.nextLine());
                if (col < 1) {
                    throw new Exception();
                }
                for (int j = 0; j < col; j++) {
                    alphabetArr[i].add((char)((int)(Math.random()*25) + 65));
                }
            }
            for (ArrayList<Character> arr : alphabetArr) {
                for (Character c : arr) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("양의 정수만 입력하세요.");
            practice7();
        }
    }

    public void practice8() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("강건강");
        arr.add("남나나");
        arr.add("도대담");
        arr.add("류라라");
        arr.add("문미미");
        arr.add("박보배");
        arr.add("송성실");
        arr.add("윤예의");
        arr.add("진재주");
        arr.add("차천축");
        arr.add("피풍표");
        arr.add("홍하하");
        int count = 0;
        String[][] arr1 = new String[3][2];
        String[][] arr2 = new String[3][2];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                arr1[row][col] = arr.get(count);
                arr2[row][col] = arr.get(count + 6);
                count++;
            }
        }
        System.out.println("== 1분단 ==");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("== 2분단 ==");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(arr2[row][col] + " ");
            }
            System.out.println();
        }
    }

    public void practice9() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("강건강");
        arr.add("남나나");
        arr.add("도대담");
        arr.add("류라라");
        arr.add("문미미");
        arr.add("박보배");
        arr.add("송성실");
        arr.add("윤예의");
        arr.add("진재주");
        arr.add("차천축");
        arr.add("피풍표");
        arr.add("홍하하");

        System.out.print("검색할 학생 이름을 입력하세요 : ");
        String name = sc.nextLine();
        if (arr.contains(name)) {
            int index = arr.indexOf(name);
            int group = (index < 6)? 1 : 2;
            String line = (index % 2 == 0)? "왼쪽" : "오른쪽";
            String row = "";
            switch (index) {
                case 0: case 1: case 6: case 7:
                    row = "첫";
                    break;
                case 2: case 3: case 8: case 9:
                    row = "두";
                    break;
                case 4: case 5: case 10: case 11:
                    row = "세";
                    break;
                default:
                    break;
            }
            System.out.println("검색하신 " + name + " 학생은 " + group + "분단 " + row + " 번째 줄 " + line + "에 있습니다.");
            return;
        }
        System.out.println("없는 학생입니다 다시 작성해주세요");
        practice9();
    }

    public void practice10() {
        try {
            System.out.print("행 인덱스 입력 : ");
            int row = Integer.parseInt(sc.nextLine());
            System.out.print("열 인덱스 입력 : ");
            int col = Integer.parseInt(sc.nextLine());
            if (row < 0 || col < 0) {
                throw new Exception();
            }
            boolean[][] arr = new boolean[6][6];
            arr[row][col] = true;
            int maxlength = Math.max(row, col);

            for (int i = 0; i <= maxlength; i++) {
                System.out.print("  " + i);
            }
            System.out.println();
            for (int i = 0 ; i <= maxlength ; i++) {
                System.out.print(i + " ");
                for (int j = 0; j <= maxlength; j++) {
                    System.out.print((arr[i][j]) ? "X" : "   ");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("양의 정수만 입력해주세요");
            practice10();
        }
    }

    public void practice11() {
        boolean[][] arr = new boolean[6][6];
        try {
            while (true) {
                System.out.print("행 인덱스 입력 : ");
                int row = Integer.parseInt(sc.nextLine());
                System.out.print("열 인덱스 입력 : ");
                int col = Integer.parseInt(sc.nextLine());
                if (row < 0 || col < 0) {
                    throw new Exception();
                }
                if (row == 99) {
                    break;
                }
                arr[row][col] = true;
                int maxlength = Math.max(row, col);

                for (int i = 0; i <= maxlength; i++) {
                    System.out.print("  " + i);
                }
                System.out.println();
                for (int i = 0 ; i <= maxlength ; i++) {
                    System.out.print(i + " ");
                    for (int j = 0; j <= maxlength; j++) {
                        System.out.print((arr[i][j]) ? "X" : "   ");
                    }
                    System.out.println();
                }
            }

        } catch (Exception e) {
            System.out.println("양의 정수만 입력해주세요");
            practice11();
        }
    }
}
