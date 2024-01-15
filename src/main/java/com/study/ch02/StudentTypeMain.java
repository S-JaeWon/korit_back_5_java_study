package com.study.ch02;

public class  StudentTypeMain {
    public static void main(String[] args) {
        StudentType A = new StudentType();
        A.name = "철수";
        A.studentYear = 1;
        A.address = "서울";

        StudentType B = new StudentType();
        B.name = "영희";
        B.studentYear = 2;
        B.address = "인천";

        StudentType C = new StudentType();
        C.name = "영일";
        C.studentYear = 2;
        C.address = "부산";

        System.out.println("이름: " + A.name);
        System.out.println("학년: " + A.studentYear + "학년");
        System.out.println("주소: " + A.address);

        int a = 10;
        double b = a; // 업캐스팅
        int c = (int)b; // 다운캐스팅


        Person p = A;
        StudentType A2 = (StudentType) p;

//        Person 김철수 = new Person();
//        StudentType 김철수군 = (StudentType) 김철수;

        // 다운캐스팅 -> 업캐스팅 -> 다운캐스팅 가능 하지만 선 업캐스팅 x

        StudentType 김철수군 = new StudentType();
        Person 김철수 = 김철수군; //업캐스팅
        StudentType 김철수학생 = (StudentType) 김철수; //다운캐스팅
    }
}
