package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
    /*//객체 생성
    //Car car = new Car("아반떼", "블랙");
    //        클래스.스태틱메소드.메소드
    Car car = Car.builder()
            .color("블랙")
            .model("아반떼")
            .build();*/
        //Car 클래스 안에서 스태틱 클래스로 정의되어있음, 스태틱에서 스태틱 호출
        //CarBuilder 클래스 호출시 Car.CarBuilder
        //Car.CarBuilder carBuilder = new Car.CarBuilder();

        Car.CarBuilder carBuilder = Car.builder();
        Car car2 = carBuilder.build();

        //위 두줄의 코드를 한 줄로 축약
        //Car car = Car.builder().build();

        Car car = Car.builder().model("아반떼").color("블랙").build();
        Car car1 = Car.builder().build();

        System.out.println(car);
        System.out.println(car1);

        Student student = Student.builder()
                .name("심재원")
                .address("남구")
                .age(29)
                .build();

        System.out.println(student);

        Member member = Member.builder()
                .name("aaa")
                .Phone("1213123")
                .build();

        System.out.println(member);

    }
}
