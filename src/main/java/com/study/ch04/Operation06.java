package com.study.ch04;

public class Operation06 {
    public static void main(String[] args) {
        /*
        조건연산자(삼항연산자)
        a > 0 ? "양수" : a == 0 ? "0" : "음수"
         */

        int iResult = 10 > 2 ? 1111 : 2222; // 결과 값 자료형 일치 해야 함. 1111 와 2222는 int 형
        String sResult = 10 > 2 ? "1111" : "2222";
        Boolean bResult = null;

        String name = ""; // 값이 공백, 비었음
        String name1 = null; // 주소 x , 변수가 비었음
        System.out.println(name == null);

        String name2 = "심재원";
        String name3 = new String("심재원");
        System.out.println(name2);
        System.out.println(name3);
    }
}
