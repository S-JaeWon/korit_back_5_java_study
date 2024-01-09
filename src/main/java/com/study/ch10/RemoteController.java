package com.study.ch10;

public class RemoteController extends ElectronicDevice {

    //ctrl + o -> 오버라이드 단축키 ctrl + i -> 재정의 (추상클래스)
    @Override
    void showDeviceState() {
        System.out.println("리모컨 상태확인");
    }

}
