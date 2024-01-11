package com.study.ch07.StudentList;

public class Student {
    String name;
    String address;
    int age;
    int score;

    Student (String name, String address, int age, int score) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
