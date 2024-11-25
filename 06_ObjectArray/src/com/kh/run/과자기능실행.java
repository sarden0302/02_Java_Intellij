package com.kh.run;

import com.kh.service.과자추가기능;
import com.kh.view.과자정보출력;

public class 과자기능실행 {

    public static void main(String[] args) {
        String companyName = "맛나 과자";

        int maxSnacks = 5;

        // 과자 추가 기능 과자정보출력 가져오기
        과자추가기능 service = new 과자추가기능(maxSnacks);
        과자정보출력 view = new 과자정보출력();
        view.추가결과(service.addSnack("초코칩 쿠키", 1500, "달콤한초코맛"));
        view.추가결과(service.addSnack("허니버더칩", 2000, "달콤한 버터맛"));
        view.추가결과(service.addSnack("새우강", 1200, "짭짤한 새우맛"));
        view.추가결과(service.addSnack("고구마칩", 1800, "달콤한 고구마맛"));
        view.추가결과(service.addSnack("감자칩", 1500, "고소한 감자맛"));
        view.추가결과(service.addSnack("치즈볼", 1900, "고소한 치즈맛"));


        view.과자리스트출력(companyName, service.getSnacks(), service.getCount());

    }
}
