package com.study.ch13;

/*
* Company 클래스를 싱글톤을 적용하여 구현하시오
* */

public class Company {
    // 1. 자기 자신을 스태틱 변수 생성
    private static Company instance;
    private String name;

    // 2. 생성자는 private 이어야 함

    private Company(){}

    // static getter 생성
    public  static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
