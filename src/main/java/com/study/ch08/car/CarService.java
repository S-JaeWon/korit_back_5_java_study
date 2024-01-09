package com.study.ch08.car;

public class CarService {
    CarRepository carRepository; //CarRepository 속 내용을 필요로 하기에 불러옴

    // CR 내용을 받아 오기 위해 생성자 생성
    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isFull() {
        /*int emptyCount = 0;
        for (int i = 0; i < carRepository.cars.length; i++) { //배열주소가 CR에 있기 때문에 cars -> carRepository.cars
            if (carRepository.cars[i] == null) {
                emptyCount++;
            }
        } //CR
        //return carRepository.getEmptyCount() ==0; //emptyCount -> carRepository.getEmptyCount()*/
        return carRepository.getEmptyIndex() == -1;
    }
    //리턴이 필요 x
    void append(Car car) {
        /*for (int i = 0; i < cars; i++) { //cars -> carRepository.cars
            if (cars[i] == null) {
                cars[i] = car;
                break;
            }
        }*/
        carRepository.insert(car);
    }
    void printCarList() {
        Car[] cars = carRepository.getCarDatas();
        if(cars.length == 0) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }



}
