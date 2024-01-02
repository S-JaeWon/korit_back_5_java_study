package com.study.ch02;

public class ConstantMain {
    public static void main(String[] args) {
        // 상수
        // 대문자로만 표기한다.
        // 최초 한번만 대입이 가능하다.
        // 무조건 초기화가 되어야 한다.
        final String FILE_PATH = ""; //= "c:/aws/project"; //final 변수의 상수화 : 값 변화x

        System.out.println(FILE_PATH); //무조건 대입, 초기화가 되어야함.

        //FILE_PATH = "d:/aws/project";
    }
}
