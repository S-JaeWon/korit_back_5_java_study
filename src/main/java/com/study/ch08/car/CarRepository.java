package com.study.ch08.car;

public class CarRepository {
    final Car[] cars;

    CarRepository(Car[] cars) {
        this.cars = cars;
    }

    /*int getEmptyCount() {
        int emptyCount = 0;
        for (int i = 0; i < cars.length; i++) { //배열주소가 CR에 있기 때문에 cars -> carRepository.cars
            if (cars[i] == null) { //위 에 Car 배열이 있기 때문에 carRepository.cars -> cars
                emptyCount++;
            }
        }
        return emptyCount;
    }*/ //getEmptyIndex 함수를 생성했기에 필요x

    int getEmptyIndex() {
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] == null) {
                return i;
            }
        }
        return -1;
    }

     void insert(Car car) {
        cars[getEmptyIndex()] = car; // getEmptyIndex 함수에 car 변수를 대입
    }

    Car[] getCarDatas() {
        int carCount = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                carCount++;
            }
        }
        Car[] newCars = new Car[carCount];
        int j = 0;
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] != null) {
                newCars[j] = cars[i];
                j++;
            }
        }
        return newCars;
    }


}























