package com.study.ch03;

public class Function02 {

    //매개변수x 리턴x

    public static void fx01(){
    // void: 리턴값 x
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }
    //함수명이 같더라도 매개변수 위치(자료형)가 다르므로 사용 가능
    //-> 함수의 오버로딩: 함수명이 같더라도 매개변수의 자료형이 다르면 함수 정의 가능
    public static void fx02(String name, int age) {
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println();
    }
    //변수명 상관x
    //public static void fx02(int age2, String name2) -> 사용 불가능

    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100;
    }

    public static String fx04(String name, int age) {
        return name + ", " + age;
    }

    public static void main(String[] args) {
        fx01();
        fx02(29, "심재원");
        fx02("심재원", 29);
        int num = fx03();
        System.out.println(fx03());
        String result = fx04("심재원", 29);
        System.out.println(result);
    }
}
