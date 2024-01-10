package com.study.ch14;

public class ObjectMain {
    public static void main(String[] args) {
        //ObjectTest objectTest = new ObjectTest(); 생성자 생성시 괄호 안 변수 기입, 생성자 생성으로 메인문에 변수 선언 필요x
        ObjectTest objectTest = new ObjectTest("심재원", "남구"); //ObjectTest 클래스 호출

        System.out.println(objectTest.toString());
        System.out.println(objectTest);

        ObjectTest objectTest1 = new ObjectTest("심재원", "남구");

        System.out.println(objectTest.equals(objectTest1));
        System.out.println(objectTest == objectTest1);

        System.out.println(objectTest.getClass());
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class);

        System.out.println(objectTest.hashCode()); //euqals과 달리 값을 비교함
        System.out.println(objectTest1.hashCode());

    }
}
