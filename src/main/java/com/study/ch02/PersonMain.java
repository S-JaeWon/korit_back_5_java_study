package com.study.ch02;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person(); // 없는 자료형 이므로 new 붙여줌
        p.name = "심재원"; // p.~~ -> 그 주소를 향함
        p.age = 28;

        Person p2 = new Person();
        p2.name = "홍길동";
        p2.age = 24;

        int a = 10; // 10 -> 리터럴 상수

        //이름, 학년, 주소를 저장할 수 있는 StudentType 클래스를 만드시오.



    }
}
