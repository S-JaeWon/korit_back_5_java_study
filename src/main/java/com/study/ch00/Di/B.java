package com.study.ch00.Di;

public class B {
    private A a;

    /*public B() {
        a = new A();
    }
    public void printHello() {
        a.test();
    } (1)*/

    public  B(A a) {
        this.a = a;
    }
    public  void printHello() {
        a.test();
    }
}
