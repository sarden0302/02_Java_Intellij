package com.kh.field.privatePack;

public class PrivateEx {
    private String 계좌번호;
    private double 계좌잔액;

    // private으로 생성된 변수명을 이용하기 위해 getter & setter (함수) 사용
    // 단축키 Alt + insert

    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public double get계좌잔액() {
        return 계좌잔액;
    }

    public void set계좌잔액(double 계좌잔액) {
        this.계좌잔액 = 계좌잔액;
    }
}
