package com.study.ch07.StudentList;

public class StudentDB {

    void studentList(Student student) {
        System.out.println("학생 정보");
        System.out.println("이름: " + student.name);
        System.out.println("주소: " + student.address);
        System.out.println("나이: " + student.age);
        System.out.println("점수: " + student.score);
        System.out.println();
    }
}
