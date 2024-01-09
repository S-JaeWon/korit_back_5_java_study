package com.study.ch11;

public class Phone {
    static int autoCount = 0;
    int serialNumber;
    Company company;

    public Phone(Company company) {
        autoCount++; //static을 안 쓴다면 생성자 밖에서 하나씩 더해야함 -> 메소드 이동시 전부 옮겨야하는 번거로움이 있음.
        this.serialNumber = 20240000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
