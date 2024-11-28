package com.kh.CollectionEx.pack3.mapEx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SnackService {
    public void method1() {
        HashMap<String, Integer> snackList = new HashMap<>();

        snackList.put("구름과자", 2000);

        System.out.println("모든 list : " + snackList);
    }

    public void method2() {
        HashMap<String, String> lunchList = new HashMap<>();
        lunchList.put("김치찌개", "한식");
        lunchList.put("파스타", "양식");
        lunchList.put("짜장면", "중식");
        lunchList.put("스테이크", "양식");
        lunchList.put("비빔밥", "한식");

        System.out.println("점심리스트 확인 : " + lunchList);
        System.out.println();

        lunchList.remove("짜장면");
        System.out.println("점심리스트 확인 : " + lunchList);
        System.out.println((lunchList.containsKey("짜장면")) ? lunchList : "짜장면은 제거 되었습니다.");
        System.out.println();

        lunchList.put("스테이크", "한식");
        System.out.println("점심리스트 확인 : " + lunchList);
        System.out.println();

        System.out.println("****** 한식만 출력 ******");
        for (Map.Entry<String, String> entry : lunchList.entrySet()) {
            if (entry.getValue().equals("한식")) {
                System.out.println(entry);
            }
        }

        lunchList.clear();
        System.out.println("\n점심리스트 확인 : " + lunchList);
        System.out.println(lunchList.isEmpty());
        System.out.println();

    }
}
