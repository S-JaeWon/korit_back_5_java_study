package com.study.ch08.member;

public class Member {
    String code;
    String name;
    int age;
    String address;

    //Alt + Ins -> constructor, 생성자 생성
    Member(String code, String name, int age, String address) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
