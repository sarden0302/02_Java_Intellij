package com.kh.basic;

public class 어노테이션 {
    /*
        @ (어노테이션, Annotation = 주석 註釋(덧붙이다, 설명하다))

        Spring 주로 사용

        자주 사용되는 기본 Annotation
        - @Override
            : 부모 클래스의 method와 같은 이름으로 작성하여 대채되어 사용된다.
            ※ Object의 toString() 함수롤 가져와 대체하여 많이 사용.
        -
     */

    /*
        getter setter constructor toString 과 같이 자주 사용하는 매서드는
        lombok이라는 회사 기능 사용 가능

        @Getter
            public String getName() {
                return this.name;
            }
        @Setter
            public void setName(String name) {
                this.name = name;
            }

        constructor(생성자)
        @NoArgsConstructor
            - 기본생성자
            public 클래스명() {
            }

        @AllArgsConstructor
            - 필수 생성자 (모든 파라미터 값을 받고 정의하는)
            public 클래스명(변수 필드1, 변수 필드2, ...) {
                this.필드1 = 필드1;
                this.필드2 = 필드2;
                .
                .
                .
            }

     */


}
