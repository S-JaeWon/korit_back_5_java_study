package com.study.ch19;

import lombok.ToString;

//@ToString
public class Student {
    private String name;
    private String address;
    private int age;

    //5)
    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    } //@AllArgsConstructor

    //2)생성 해줄 수 있는 빌더 메소드 -> StBuilder 주소 생성
    public static StBuilder builder() {
        return new StBuilder();
    }
    //1)클래스 내부에 스태틱 빌더 클래스 생성
    //4)setter 메소드에서 얻은 값으로 StBuilder 객체 생성
    public static class StBuilder {
        private String name;
        private String address;
        private int age;

        //3) 자기 주소로 리턴 하는 setter 메소드
        public StBuilder name(String name) {
            this.name = name;
            return this; //자기 자신의 주소로 -> StBuilder 주소
        }

        public StBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StBuilder age(int age) {
            this.age = age;
            return this;
        }

        //6)
        public Student build() {
            return new Student(name, address, age);
        }

    }
    //@ToString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

