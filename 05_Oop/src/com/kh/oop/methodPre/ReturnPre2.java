package com.kh.oop.methodPre;

public class ReturnPre2 {

    public String method1(String userName, int userAge) {
        return new String("안녕하세요! 제 이름 " + userName + "이고, 나이는 " + userAge + "세 입니다.");
    }

    public String method2(int num1, int num2) {
        if (num1 > num2) {
            return new String(num2 + "보다 " + num1 + "이 큰 숫자입니다.");
        }
        return new String(num1 + "보다 " + num2 + "이 큰 숫자입니다.");
    }

    public String method3(int grade) {
        String result = grade + "등급 : ";
        switch (grade / 10) {
            case 9: case 10:
                result += 'A';
                break;
            case 8:
                result += 'B';
                break;
            case 7:
                result += 'C';
                break;
            case 6:
                result += 'D';
                break;
            default:
                result += 'F';
                break;        }

        return result;
    }

    public String method4(double price, double discountRate) {
        return new String("원래 가격 : " + price + "할인율 : " + discountRate + "% 최종 금액 : " + price * (100 - discountRate) / 100);
    }

    public String method5(int[] arr) {
        double total = 0.0;
        String result = "배열[";
        for (int a : arr) {
            total += a;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            result += arr[i] + ",";
        }
        result += arr[arr.length - 1] + "] 평균 값 : " + total / arr.length ;
        return result;
    }

    public String method6(int age) {
        String result = "";
        if (age <= 19) {
            result = "출력 결과 : " + age + " 결과 : 미성년자입니다.";
        } else {
            result = "출력 결과 : " + age + " 결과 : 성인입니다.";
        }
        return result;
    }

    public String method7(String first, String second) {
        return new String(first + " " + second);
    }

    public String method8(String[] fruits, String fruit) {
        String result = "출력 결과:배열[";
        for (int i = 0; i < fruits.length - 1; i++) {
            result += "\"" + fruits[i] + "\",";
        }
        result += "\"" + fruits[fruits.length - 1] + "]";
        for (String f : fruits) {
            if (f.equals(fruit)) {
                return new String(result + "찾는 문자열:\"" + fruit + "\"결과 : 배열에 " + fruit + "이(가) 존재합니다.");
            }
        }
        return new String(result + "찾는 문자열:\"" + fruit + "\"결과 : 배열에 " + fruit + "이(가) 존재하지 않습니다.");
    }

    public String method9(int radius) {
        return new String("출력 결과:반지름:" + radius + " 원의 넓이:" + (double)Math.PI*radius*radius);
    }
}
