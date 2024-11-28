package com.kh.CollectionEx.pack3.mapPre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapService {

    // 1. HashMap 이용해서 값 추가하고 확인하기
    public void method1() {
        HashMap<String, String> nation = new HashMap<>();

        //데이터 추가
        nation.put("KR", "Korea");
        nation.put("US", "United States");
        nation.put("EU", "Europe");
        nation.put("KR", "korea");


        System.out.println("각 국가들의 약칭 확인하기 : " + nation.keySet().toString() + "\n모든 entry 값 : " + nation.entrySet().toString());

        System.out.println("---------------------------");
        System.out.println(nation.get("EU"));
        System.out.println(nation.get("CN")); // 초기화 안되어 있으니 null 값 반환

        System.out.println("저장된 나라 종류 수 : " + nation.size());

        // remove
        nation.remove("KR");
        System.out.println("After removing");
        System.out.println("각 국가들의 약칭 확인하기 : " + nation.keySet().toString() + "\n모든 entry 값 : " + nation.entrySet().toString());

        System.out.println("clear() 이후");
        nation.clear();
        System.out.println("각 국가들의 약칭 확인하기 : " + nation.keySet().toString() + "\n모든 entry 값 : " + nation.entrySet().toString());



    }

    // 2. mtheod2
    public void method2() {
        Map<String, String> map = new HashMap<>();
        map.put("학원", "서울시 강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");

        Set<String> set = map.keySet();
        System.out.println("keyset() 확인하기 : " + set.toString());

        for (String key : set) {
            System.out.println(key + " = " + map.get(key));
        }
    }

    public void method3() {
        HashMap<String, String> map = new HashMap<>();
        map.put("학원", "서울시 강남구");
        map.put("집", "경기도");
        map.put("63빌딩", "서울시 영등포구");
        map.put("롯데타워", "서울시 송파구");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println("keyset() 확인하기 : " + entrySet.toString());

        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
