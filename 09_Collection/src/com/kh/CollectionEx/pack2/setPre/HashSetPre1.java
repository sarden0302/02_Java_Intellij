package com.kh.CollectionEx.pack2.setPre;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetPre1 {
    /*
        Set (집합, 주머니)
        - 기본적으로 순서를 유지하지 않음 (index x, get 사용 x)
        - 중복 데이터 x (같은 값 들어오면 덮어쓰기)

        1. HashSet       : 처리 속도가 빠른
        2. TreeSet       : 자동 정렬
        3. LinkedHashSet : 순서 유지
     */
    /*
        method1() 아무 값이나 넣고 중복 허용 확인
     */

    public void method1() {
        HashSet<Object> set = new HashSet<>();
        set.add("점심");
        set.add(100);
        set.add(true);
        set.add(3.14);

        set.add("점심");
        set.add("저녁");
        set.add("점심2");
        System.out.println(set);
        // HashSet은 넣은 순서대로 저장 x
        // [점심2, 점심, 100, 3.14, 저녁, true]

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add("점심");
        list.add("점심");
        list.add("점심");
        list.add("점심");
        list.add("저녁");
        list.add("저녁2");
        System.out.println(list);

    }

    // method2
    public void method2() {
        HashSet<String> set = new HashSet<>();
        set.add("사과");
        set.add("바나나");
        set.add("포도");
        set.add("사과"); // 중복 값 (저장 x)
        set.add("사과 ");
        set.add(" 사과");
        set.add(" 사과 ");
        // [포도, 사과, 바나나]
        // 띄어쓰기 : "\t"
        System.out.println("Set에 저장된 모든 리스트 출력 : " + set);
        System.out.println("개수 확인 : " + set.size());

        if (set.remove("포도")) {
            System.out.println("포도를 제외한 Set에 저장된 모든 리스트 출력 : " + set);
        }

        if (set.contains("바나나")) {
            System.out.println("바나나가 저장되어 있습니다.");
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.print("clear 이후 print 실행");
            System.out.println(", set 내부 : " + set);
        }
    }

    // method3 HashSet 이용해서 자료형 10, 20, 3000, 500, 40 추가
    public void method3() {
        HashSet<Integer> intSet = new HashSet<>();
        // 값을 저장할 때 자리값 = 추가한값
        //        0          = Integer.valueOf(500);
        //     index 0번쨰    = 500
        intSet.add(10);
        intSet.add(20);
        intSet.add(3000);
        intSet.add(50);
        intSet.add(40);

        System.out.println("초기 set 리스트 : " + intSet);

        // Integer.valueOf() 와 같은 특수 기능 사용하지 않아도 숫자를 제거할 수 있음
        // key||index 없기 때문
        if (intSet.remove(3000))  {
            System.out.println("3000 제거후 리스트 : " + intSet);
        }

        if (intSet.contains(500))  {
            System.out.println("들어있음");
        } else {
            System.out.println("500 안들어 있음 : " + intSet);
        }

        intSet.clear();
        if (intSet.isEmpty()) {
            System.out.println("intSet 모두 클리어됌. Set list : " + intSet);
        }
    }

    // 향상된 for문 (for-each) 출력하기
    // Iterator 사용
    public void method4() {
        HashSet<String> strList = new HashSet<>();

        strList.add("참외");
        strList.add("토마토");
        strList.add("수박");

        System.out.println("strList : " + strList);
        System.out.println("향상된 for문 사용");
        for (String s : strList) {
            System.out.println(s);
        }

        System.out.println("\nIterator 사용");
        Iterator<String> iterator = strList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public void method5() {
        HashSet<String> strSet = new HashSet<>();
        strSet.add("딸기");
        strSet.add("바나나");
        strSet.add("포도");

        // Iterator 반복문을 이용해서 HashSet 출력
        Iterator<String> itr = strSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        /*
            Iterator : Collection으로 작성된 객체들 모두 사용 가능

            .iterator()

            .hasNext()

            .next()
         */
    }

    // Iterator 이용해서 로또 번호 생성
    public void iterLotto() {
        // 1. HashSet을 이용해서 로또 번호 저장
        HashSet<Integer> lottoNumbers = new HashSet<>();

        // 2. 중복 없이 6개의 번호 생성
        for (; lottoNumbers.size() < 6;) {
            // Math.random()
            int number = (int)(Math.random() * 45) + 1;
            lottoNumbers.add(number);
        }

        int[] result = lottoNumbers.stream().mapToInt(i -> i).toArray();
        List<Integer> resultList = lottoNumbers.stream().toList();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public void forLotto() {
        // 1. HashSet을 이용해서 로또 번호 저장
        HashSet<Integer> lottoNumbers = new HashSet<>();

        // 2. 중복 없이 6개의 번호 생성
        for (; lottoNumbers.size() < 6;) {
            // Math.random()
            int number = (int)(Math.random() * 45) + 1;
            lottoNumbers.add(number);
        }

        System.out.println("lottoNumbers 출력 : " + lottoNumbers);
        for (int randomNumber : lottoNumbers) {
            System.out.println(randomNumber);
        }

    }
}
