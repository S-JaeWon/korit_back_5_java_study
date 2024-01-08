package com.study.ch08.car;

import java.util.Scanner;

public class CarMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        boolean loopFlag = true;

        Car[] cars = new Car[3];
        //각 내용을 호출 하기위해 불러옴, new ~~~ -> 생성자 호출
        CarRepository carRepository = new CarRepository(cars);
        //자료형 변수명 = 값(새로 생성 해야 하므로 앞에 new 를 붙여야함)
        CarService carService = new CarService(carRepository);
        /*//carService.carRepository = carRepository;
        //CarService carService =  new CarService(new CarRepository(new Car[3]));

        //Carservice 안에 CarRepsotory 내용이 있기에 적어줌
        carService.carRepository = carRepository;
        carRepository.cars = cars; //이것도 생성할때 값을 넣기 위해 생성자 사용*/

        while (loopFlag) {
            System.out.println("자동차 관리 프로그램");
            System.out.println("1. 자동차 등록");
            System.out.println("2. 자동차 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴선택 >>> ");

            selectedMenu = scanner.nextLine();

            if ("q".equalsIgnoreCase(selectedMenu)) {
                System.out.println("프로그램 종료중. . .");
                loopFlag = false;
            } else if ("1".equals(selectedMenu)) {
                System.out.println("<<< 자동차 등록 페이지 >>>");
                //int emptyCount = 0; CS

                String model = null;
                String color = null;

                /*for (int i = 0; i < cars.length; i++) { // 칸이 다차면 등록 불가 메세지 출력
                    if (cars[i] == null) {
                        emptyCount++;
                    }
                } //CS*/

                if (carService.isFull()) { // emptyCount == 0 -> carService.isEmpty()
                    System.out.println("더이상 등록 할 수 없습니다.");
                    continue;
                }

                System.out.print("모델명 >>> ");
                model = scanner.nextLine();
                System.out.print("색상 >>> ");
                color = scanner.nextLine();

                Car car = new Car(model, color); //entity

                /*for (int i = 0; i < cars.length; i++) {
                    if (cars[i] == null) {
                        cars[i] = car;
                        break;
                    }
                }*/
                carService.append(car);

            } else if ("2".equals(selectedMenu)) {
                System.out.println("<<< 자동차 조회 페이지 >>>");
                /*for(int i = 0; i < cars.length; i++) {
                    //System.out.println(cars[i].toString());
                    System.out.println("[" + i + "] > ");
                    if(cars[i] == null) { // null 이 있다면 메소드 참조 불가 -> continue 사용
                        System.out.println("x");
                        continue;
                    }
                    System.out.print(cars[i].toString());*/
                carService.printCarList();
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
