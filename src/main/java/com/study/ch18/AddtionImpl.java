package com.study.ch18;

public class AddtionImpl implements Addtion {
    @Override
    public int add(int x, int y) {
        System.out.println("AddtionImpl에서 호출한 add 메서드");
        return x + y;
    }
}
