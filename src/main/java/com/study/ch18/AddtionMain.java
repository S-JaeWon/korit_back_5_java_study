package com.study.ch18;

import javax.swing.text.View;

public class AddtionMain {
    public static void main(String[] args) {
        //익명 클래스
        Addtion addtion1 = new Addtion() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        Addtion addtion2 = new AddtionImpl();

        System.out.println(addtion1.add(10, 20));
        System.out.println(addtion2.add(30, 40));

        //람다식 '조건' -> 인터페이스 안에 딱 하나의 추상메소드만 정의되어 있어야 한다.
        //단, 일반(default) 메서드는 여러개 정의되어 있어도 된다.
        Addtion addtion3 = (int x, int y) -> {
            System.out.println("람다식으로 구현한 add메서드");
            return x + y;
        };

        System.out.println(addtion3.add(50, 60));

        //1. 람다식의 매개변수 자료형은 생략 할 수 있다.
        Addtion addtion4 = (x, y) -> {
            return x + y;
        };

        //2. 함수의 실행문이 하나의 명령문만 실행된다면 중괄호를 생략 할 수 있다.
        //단, return은 중괄호를 생략 할 시 같이 생략한다.
        Addtion addtion5 = (x, y) -> x + y;
        Viewer viewer = (viewData) -> { //자료형 생략
            System.out.println("화면 출력");
        };
        Viewer viewer2 = (viewData) -> System.out.println("화면 출력");

        //3. 매개변수가 하나이면 매개변수의 괄호를 생략 할 수 있다.
        Viewer viewer3 = viewdata -> System.out.println("화면 출력");
    }
}
