package com.study.ch07.StudentList;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String select = null;

            System.out.println("r. 등록하기");
            System.out.println("q. 나가기");

            System.out.print(">>> ");
            select = scanner.nextLine();

            if("r".equalsIgnoreCase(select)) {
                String studentName = null;
                String studentAddress = null;
                int studentAge = 0;
                int studentScore = 0;

                System.out.print("이름: ");
                studentName = scanner.next();

                System.out.print("주소: ");
                studentAddress = scanner.next();

                System.out.print("나이: ");
                studentAge = scanner.nextInt();

                System.out.print("점수: ");
                studentScore = scanner.nextInt();
                scanner.nextLine();

                Student student = new Student(studentName, studentAddress, studentAge, studentScore);
                studentRepository.enrollStudent(student);
            } else if("q".equalsIgnoreCase(select)) {
                break;
            } else {
                System.out.println("다시 입력");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");

    }
}
