package com.study.ch00;

public class B {
    private A a;
    public B() {
        a = new A();
    }
    public void printHello() {
        a.test();
    }
}
