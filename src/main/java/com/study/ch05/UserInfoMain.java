package com.study.ch05;

import java.util.Scanner;

public class UserInfoMain {
    public static void main(String[] args) {
        /*
        * 이름: 심재원
        * 나이: 29
        * 연락처: 01051704834 숫자0 표기시 문자열로
        * 학년: 4
        * 주소: 부산 남구
        * */
        Scanner scanner = new Scanner(System.in);

        String name = null;
        int age = 0;
        String phoneNumber = null;
        int grade = 0;
        String address = null;

        System.out.print("이름: ");
        name = scanner.next();
        System.out.print("나이: ");
        age = scanner.nextInt();
        System.out.print("연락처: ");
        phoneNumber = scanner.next();
        System.out.print("학년: ");
        grade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주소: ");
        address = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("연락처: " + phoneNumber);
        System.out.println("나이: " + grade);
        System.out.println("주소: " + address);



    }
}
