package com.study.ch00.Di;

public class Main {
    public static void main(String[] args) {
       /* B b = new B();
        b.printHello(); (2)*/

        A a = new A();
        B b = new B(a);

        b.printHello();
    }
}
