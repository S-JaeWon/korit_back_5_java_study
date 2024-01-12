package com.study.ch19;

import lombok.Builder;
import lombok.ToString;

//@Builder
@ToString
public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    /*//기본 생성자
    public Car() {

    }

    //AllArgsConstructor
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }*/

    //builder 메소드가 호출 되면 CarBuilder 값 리턴
    public static CarBuilder builder() {
        return new CarBuilder();
    }
    //Car 클래스 속 내부 클래스 인 CarBuilder, 객체 만들기전 메모리 생성이 안되므로 static 사용
    public static class CarBuilder {
        private String model;
        private String color;

        public Car build() {
            return new Car(model, color);
        }
        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }
        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

    }
}
