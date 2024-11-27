package com.kh.CollectionEx.pack1.listPre;

import java.util.ArrayList;

public class ArrayListPre1 {
    public void method1() {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("새우깡");
        arrayList.add("맛동산");
        arrayList.add("포카칩");
        arrayList.add("고구마칩");
        arrayList.add("고래밥");
        arrayList.add("포카칩");

        System.out.println(arrayList);
        System.out.println("총 개수 : " + arrayList.size());
        System.out.println();

        // 만약에 index1 자리에 허니버터칩을 넣고 싶다면! -> add(index 자리넘버, 넣고자하는 값)

        arrayList.add(1, "허니버터칩");
        System.out.println(arrayList);
        System.out.println("총 개수 : " + arrayList.size());
        System.out.println();

        // 특정 위치의 값 가져오기
        System.out.println("3번째 값 : " + arrayList.get(2));
        System.out.println();

        // 변경
        arrayList.set(2, "망고과자");
        System.out.println("=== 망고 과자로 변경 후 ====");
        System.out.println(arrayList);
        System.out.println();

        // 특정 위치의 값을 삭제
        System.out.println("== 망고과자 삭제 ===");
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println();

        // 입력을 통해 삭제 (처음에 찾은 값만 삭제)
        arrayList.remove("포카칩");
        System.out.println("==== 포카칩 입력으로 삭제 ====");
        System.out.println(arrayList);
        System.out.println();

        // contains(값) or contains(인덱스)
        System.out.println("망고과자가 존재하나요? : " + arrayList.contains("망고과자"));
        System.out.println();

        // clear();
        arrayList.clear();
        System.out.println("리스트 안에 값이 깨끗하게 지워졌나요? : " + arrayList.isEmpty());

    }

    public void method2() {
        // 과일을 저장하고 수정하고 삭제하고 비우고 무사히 비워졌는지 확인하는 기능
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("포도");
        fruits.add("바나나");
        fruits.add("망고");
        System.out.println("1. 초기 과일 리스트 : " + fruits);

        fruits.add(1, "오렌지");
        System.out.println("2. 2번째 위치에 오렌지 추가 : " + fruits);

        fruits.set(3, "파인애플");
        System.out.println("3. 바나나 파인애플로 변경 : " + fruits);

        fruits.remove(0);
        System.out.println("4. 첫번째 과일 삭제 : " + fruits);

        fruits.remove("망고");
        System.out.println("5. 망고 삭제 : " + fruits);

        System.out.println("6. 사과를 포함하고 있습니까? : " + fruits.contains("사과"));
        if (fruits.contains("사과")) {
            fruits.remove("사과");
        }
        System.out.println(fruits);

        fruits.clear();
        if (fruits.isEmpty()) {
            System.out.println("7. 리스트가 비어있나요? : " + fruits.isEmpty());
        }

    }

    //method3 기본 타입으로 자료형 제한해서 저장
    public void method3() {
        // 1. Integer
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(20);
        intList.add(300);
        System.out.println("IntList : " + intList);

        // 2. Character
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('a');
        charList.add('가');
        charList.add('b');
        charList.add('나');
        System.out.println("CharList : " + charList);

        // 3. Boolean
        ArrayList<Boolean> booleanList = new ArrayList<>();
        booleanList.add(true);
        booleanList.add(false);
        System.out.println("BooleanList : " + booleanList);

        // 4. Float
        ArrayList<Float> floatList = new ArrayList<>();
        floatList.add(1.5f);
        floatList.add(3.14f);
        System.out.println("FloatList : " + floatList);

    }
}
