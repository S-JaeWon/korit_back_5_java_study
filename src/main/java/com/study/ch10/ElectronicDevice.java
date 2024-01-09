package com.study.ch10;

/*
* 추상화
* 1. 추상 클래스: abstract class
* 2. 인터페이스: interface
* */

public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {

        powerState = true;
    }
    void setPoweroff() {

        powerState = false;
    }
    //추상 메소드: abstract void 메소드명(); -> 추상 클래스와 인터페이스만 정의가 가능함
    abstract void showDeviceState();  /*{
        System.out.println("전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"))
    }*/
}
