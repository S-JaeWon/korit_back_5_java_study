package com.study.ch00.Static;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        a1.add();
        a2.add();
        a3.add();
        System.out.println(a1.getNum());
        System.out.println(a2.getNum());
        System.out.println(a3.getNum());
        //a.add 늘어날때 마다 증가
        //static 아니라면 출력값 1

    }
}
