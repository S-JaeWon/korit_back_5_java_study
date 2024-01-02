package com.study.ch02;

public class Variable {
    public static void main(String[] args) {
        int date = 20231230;
        //-> 업캐스팅 int -> double / 좀 더 상위 개념으로
        double date2 = (double)date;
        //-> 다운캐스팅 double -> int
        //int date3 = date2; -> error
        int date3 = (int) date2; //업캐스팅시 형변환x 다운캐스팅시 형변환 명시 필

        // 형변환: 문자 -> 정수 -> 실수

        char a = '1';
        int b = a;
        double c = b;


        System.out.println(date + 1);
        System.out.println(date + 2);
        System.out.println(date + 3);
        System.out.println(date + 4);
        System.out.println(date + 5);
        System.out.println(date + 6);
        System.out.println(date + 7);
        System.out.println(date + 8);
        System.out.println(date + 9);
    }
}
