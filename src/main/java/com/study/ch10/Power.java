package com.study.ch10;
//인터페이스는 기본클래스가 추상 메소드이다. abstract 단어 생략
public interface Power {
    //boolean powerState; 인터페이스는 변수 선언 불가능
    //대신 초기화 하면 선언 가능 -> final ~ , 상수만 가능
    boolean powetState = false;

    String ERROR_CODE = "-9999"; // 상수 코드의 예 (상수 이므로 변수명 대문자)

    void setPowerOn();
    void setPoweroff();

    //default를 붙이면 일반 메소드를 붙일 수 있다.
    default void test() {


    }
}
