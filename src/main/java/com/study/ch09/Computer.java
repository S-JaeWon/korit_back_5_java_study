package com.study.ch09;
//TODO 상속과 확장
public class Computer extends ElectronicDevice { // extends: 상속, 자식 클래스 02
    String cpu;
    int ram;

    void playGame() {
        System.out.println("PC 게임을 합니다.");
    }

    // 재정의, override: 부모의 메소드와 동일한 메소드 형태로 실행문만 다시 정의 할 수 있다.
    void showDeviceState() {
        System.out.print("컴퓨터" );
        super.showDeviceState();
    }
}
