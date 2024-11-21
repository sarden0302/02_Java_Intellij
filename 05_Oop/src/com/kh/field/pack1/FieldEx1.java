package com.kh.field.pack1;

public class FieldEx1 {
    /* 필드(field) : 멤버 변수
        - 객체의 속성
        
        [작성법]
            [접근제한자][예약어] 자료형 변수명 
            
        [접근제한자]
            - public        : 어디서든 가능
            - protected     : 다른 패키지의 자식 객체 허용
                              같은 패키지에서 접근 가능
            - private       : class 파일명 내부에서만 사용 가능
                              외부에선 getter & setter 사용해서 접근 가능
            - default       : same package
    */
    
    //접근제한자에 따른 필드 선언
    
    public String 퍼블릭 = "공개 필드";
    protected String 프로택티드 = "보호된 필드";
    private String 프라이베잇 = "비공개 필드";
    /*default*/ String 디폴트 = "기본 접근 필드";
    
    public void method1() {
        System.out.println(this.퍼블릭);
        System.out.println(this.프로택티드);
        System.out.println(this.프라이베잇);
        System.out.println(this.디폴트);
    }
}
