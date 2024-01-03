package com.study.ch05;

import java.util.Scanner;
//입력시, Scanner 입력 후 Ctrl + Space

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("타이틀: ");
        //String title = scanner.next();
        String title = scanner.nextLine(); //문자열 내 공백(띄어쓰기) 가능
        //nextLine 사용시 윗줄에 nextLine() 추가

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
        //실수 적을 시 nextDouble



        System.out.println(title + ": " + (a + b + c));
    }
}
