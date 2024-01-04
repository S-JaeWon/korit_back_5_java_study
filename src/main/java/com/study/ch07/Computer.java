package com.study.ch07;

public class Computer {
    String type;
    String cpu;
    String ram;
    String disk;

    //생성자
    //1. 클래스의 이름과 동일하다.
    //2. 메소드의 형태이다. *메소드와 함수는 소문자부터
    //3. 주소값 return 하므로 return 자료형 필요x
    Computer() {
        type = "컴퓨터";
    }

    Computer(String type) {
        this.type = type;
    }

    void showInfo() {
        System.out.println("type: " + type);
        System.out.println("cpu: " + cpu);
        System.out.println("ram: " + ram);
        System.out.println("disk: " + disk);
    }
}
