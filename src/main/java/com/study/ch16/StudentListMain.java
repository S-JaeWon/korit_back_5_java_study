package com.study.ch16;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("심재원", 29));
        students.add(new Student("A", 1));
        students.add(new Student("B", 2));
        students.add(new Student("C", 3));
        System.out.println(students);

        Student student1 = new Student("A", 10);
        student1.setAge(10 + 1);
        student1.setAge(student1.getAge() + 1);

        for(int i = 0; i < students.size(); i++) {
            //현재 인덱스 i에 해당하는 students 리스트의 Student 객체를 가져와 student 변수에 할당
            Student student = students.get(i);
            //student 객체의 getAge 메서드를 사용하여 현재 나이를 얻고,
            // 이를 1씩 증가시켜 다시 setAge 메서드를 사용하여 객체의 나이를 업데이트합니다.
            student.setAge(student.getAge() + 1);

            students.get(i).setAge(students.get(i).getAge() + 1);

        }
        System.out.println(students);
        //향상된 for
        //인덱스를 쓰지 않으므로 무조건 처음 부터 끝까지 작동함
        for(Student student : students) {
            student.setAge(student.getAge() + 1);
        }

        Student[] studentArray = new Student[4];
        for(int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("A", 1);
        }
        //System.out.println(studentArray[0]);

        for(Student student : studentArray) {
            System.out.println(student);
        }

        int i = 0;
        for(Student student : studentArray) {
            studentArray[i] = new Student("A", 1);
            i++;
        }

        //students.get(0) = new Student("A", 1);
        students.set(0, new Student("A", 1));

    }
}
