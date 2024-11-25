package com.kh.inheritanceEx;

public class 자식 extends 부모{
    // 추가 field
    private String 취미;

    // 기본 Constructor
    public 자식() {
        super();
    }

    // 필수 Constructor
    public 자식(String 성씨, String 주소, int 돈, String 차, String 취미) {
        super(성씨, 주소, 돈, 차);
        this.취미 = 취미;
    }

    public String get취미() {
        return 취미;
    }

    public void set취미(String 취미) {
        this.취미 = 취미;
    }

    // 부모 클래스의 기능(매서드)의 오버라이딩

    @Override
    public String toString() {
        return "자식{" +
                "취미='" + 취미 + '\'' +
                ", 성씨='" + 성씨 + '\'' +
                ", 주소='" + 주소 + '\'' +
                ", 돈='" + this.get돈() + '\'' +
                ", 차='" + this.get차() + '\'' +
                '}';
    }
}
