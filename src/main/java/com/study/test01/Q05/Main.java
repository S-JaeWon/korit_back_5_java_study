package com.study.test01.Q05;

public class Main {
    public static void main(String[] args) {
        /*Order order = new Order(100, "Samsung", "홍길동", 1000, 2);*/

        Order order = Order.builder()
                .orderId(100)
                .productName("Samsung GalaxyBook2 Pro")
                .consumerName("홍길동")
                .price(1450000)
                .stock(2)
                .build();

        order.showOrderInfo();
    }
}

/*주문번호: 100
* 상품명: Samsung GalaxyBook2 Pro
* 구매자: 홍길동
* 가격: 1450000
* 수량: 2*/