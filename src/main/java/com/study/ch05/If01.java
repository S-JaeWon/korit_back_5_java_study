package com.study.ch05;

public class If01 {
    public static void main(String[] args) {
        // 조건문
//        int i = 4;
        int i = 3;

        /*if(i > 3) System.out.println("i가 3보다 큽니다.");
        if(i > 3) System.out.println("if문 종료");*/
        if(i > 3) {
            System.out.println("i가 3보다 큽니다.");
            System.out.println("if문 종료");
            //중괄호로 묶어서 한번에 if문 처리
            //거짓일 시 else문 처리
            //하나의 명령일시 {} 중괄호 생략 가능
            //else문 안에 if 문 2개 이상일시 중괄호 사용
        } else if(i == 3) { // =: 대입, ==: 같음
            System.out.println("i가 3입니다.");
        } else {
            System.out.println("i가 3보다 작습니다.");
        }


        //i > 3 ? System.out.println("i가 3보다 큽니다.") : ""; 삼항연산자, 연산만 가능 함수 호출 x
        String tempStr = i > 3 ? print("i가 3보다 큽니다.") : "";
    }

    public static String print(String str){
        System.out.println(str);
        return str;
    }
}
