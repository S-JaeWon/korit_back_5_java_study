package com.study.ch00.Static;

public class A {
    private String name;
    //private  int num; 1)
    private static int num;

    public void add() {
        num++;
    }

    /*public int getNum() {
        return num;
    } 1)*/

    public static int getNum() {
        return num;
    }
}