package loof;

public class For문 {

    public void method1() {
        /*
        *  for (int i = 0; 조건식; 증감식)
        *
        *   i = index의 약자
        * */
    }

    public void method2() {
        /*
            중첩된 반복문 (nested loof)
            반복문 내에 또 다른 반복문 포함하는 구조

            메모리 효율이 떨어짐, 시간 효율 떨어짐 O(n2)
         */

        for (int i = 2; i < 10; i++) {
            System.out.println("===== " + i + "단 =====");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public void method3() {
        /*
            향상된 for 문
         */
    }

    public void method4() {
        /*
            향상된 for문 (enhanced for loop)
            자바 5버전에서부터 도인된 반복문
            기존의 for문 보다 간결, 반복문에서 index 처리가 필요하지 않을 때

            for (타입 변수명 : 컬렉션이나 배열) {
                //변수명은 각 요소를 나타냄
            }

            ** 요소의 의미
                - js    : <태그>content</태그>
                - java  : Array, Collections, or etc 구조 안에 저장된 개별 데이터
                    ex) int[] numbers = [10, 20, 30, 40]; -> 요소 : 10, 20, 30, 40
        */
    }
}
