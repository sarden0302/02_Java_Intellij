package com.kh.inheritanceEx;

public class 부모 {
    public String 성씨 = "김";
    public String 주소 = "서울시 강남구 역삼동";
    private int 돈 = 100000000;
    private String 차 = "제네시스";

    public 부모() {
    }

    public 부모(String 성씨, String 주소, int 돈, String 차) {
        this.성씨 = 성씨;
        this.주소 = 주소;
        this.돈 = 돈;
        this.차 = 차;
    }

    public int get돈() {
        return 돈;
    }

    public void set돈(int 돈) {
        this.돈 = 돈;
    }

    public String get차() {
        return 차;
    }

    public void set차(String 차) {
        this.차 = 차;
    }
}
