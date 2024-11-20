package com.kh.ex;

public class ArrayEx3 {
    public void method1() {

    }

    public void method2() {
        int[][] grades = {
              //국어 영어 수학 과학
                {90, 85, 88, 92}, //학생 1
                {78, 82, 79, 85}, //학생 2
                {88, 90, 92, 85}  //학생 3
        };

        System.out.println("====== 학생 1의 성적 ========");
        System.out.println("학생 1의 국어 성적 : " + grades[0][0]);
        System.out.println("학생 1의 영어 성적 : " + grades[0][1]);
        System.out.println("학생 1의 수학 성적 : " + grades[0][2]);
        System.out.println("학생 1의 과학 성적 : " + grades[0][3]);

    }

    //3개의 과일과 그 과일의 색상, 맛, 크기 및 정보를 저장하는 이차원 배열
    public void method3() {
         String[][] fruits= {
                 {"사과", "빨강", "단맛", "중간"},
                 {"귤", "오랜지", "새콤", "작음"},
                 {"포도", "보라", "달콤", "작음"}
         };

        System.out.println("과일 1 : " + fruits[0][0] + "(색상 :" + fruits[0][1] + ", 맛 :" + fruits[0][2] + ", 크기 + " + fruits[0][3] + ")");
        System.out.println("과일 2 : " + fruits[1][0] + "(색상 :" + fruits[1][1] + ", 맛 :" + fruits[1][2] + ", 크기 + " + fruits[1][3] + ")");
    }
    
    /*
        없는 자리에 index 가져올시 Array out of Bounce Exception
        index는 무조건 순차적으로 자동 번호 매김이됌
        기입 안할 시 0으로 초기화
     */
}
