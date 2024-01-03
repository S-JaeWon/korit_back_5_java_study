package com.study.ch06;

public class For01 {
    public static void main(String[] args) {
        //일정하게 반복될 때 ,반복횟수 중요
        for (int i = 0; i < 10; i++){
            System.out.println("i: " + i);
        }

        //조건이 중심일 때
        int i = 0;
        while (i < 10){
            System.out.println("i: " + i);
            i++;
        }
    }
}
