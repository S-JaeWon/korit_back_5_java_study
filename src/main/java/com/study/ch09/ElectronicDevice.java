package com.study.ch09;

public class ElectronicDevice {
    boolean powerState; //booelan 기본값은 false

    void setPowerOn() {
        powerState = true;
    }
    void setPoweroff() {
        powerState = false;
    }

    void showDeviceState() {
        System.out.println("전원 상태: " + ((powerState) ? "켜짐" : "꺼짐"));

    }

}
