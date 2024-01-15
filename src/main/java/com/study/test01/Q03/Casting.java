package com.study.test01.Q03;

public class Casting {
    public static void main(String[] args) {
        Program[] programs = new Program[2];
        programs[0] = new Java();
        programs[1] = new C();

       /* for(int i = 0; i < programs.length; i++) {
            programs[i].develop();
        }*/
        //instanceof 또는 getClass()를 활용하여 다운캐스팅 활용
        //ch09 참조
        for(int i = 0; i < programs.length; i++) {
            programs[i].develop();
            //if(programs[i] instanceof Java)
            if(programs[i].getClass() == Java.class) {
                Java java = (Java) programs[i]; //다운캐스팅
                java.garbageCollection();
            //if(programs[i] instanceof C)
            } else if(programs[i].getClass() == C.class) {
                C c = (C) programs[i]; //다운캐스팅
                c.defineStructure();
            }
        }
    }
}

/*
* 자바 프로그램을 개발합니다.
* 메모리를 정리합니다.
* C 프로그램을 개발합니다.
* 구조체를 정의합니다.
* */