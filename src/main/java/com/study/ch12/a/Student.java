package com.study.ch12.a;
//TODO Setter Getter
public class Student {
    private String name;
    private String address;

    //private Student() {} 이라면 메인에서 생성자 생성 불가능

    public Student() {


    }
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //변수를 정할때
    public void setName(String name) { //변수명은 set 을 붙여서 만든다
        this.name = name;
    }
    //변수를 불러올때
    public String getName() {
        return name;
    }
    //alt + Ins -> Setter, Getter 생성 단축키
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void test() {
        //System.out.println(10 + 20);
        System.out.println(add(10, 20));
        System.out.println(add(20, 30));
        System.out.println(add(40, 50));
    }

    private int add(int a, int b) {
        return a + b;
    }
}










