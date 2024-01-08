package com.study.ch08.car;

public class Car {
    String model;
    String color;

    //NoArgsConstructor
    Car() {

    }
    //AllArgsConstructor
    //생성자는 함수와 달리 클래스명과 '동일' 해야함, 리턴자료형이 없음, ex) 함수: int add(int a, int b)
    //생성자는 리턴값인 주소를 무조건 해주기 때문에 생략
    Car(String model, String color) {
        this.model = model;
        this.color = color;

    }
    /*public String toString() {
        return "car(model = " + model + ", color = " + color + ")";
    }*/
    // alt + Ins -> 단축키 ,
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
