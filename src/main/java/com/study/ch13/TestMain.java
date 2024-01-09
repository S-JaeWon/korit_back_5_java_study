package com.study.ch13;

public class TestMain {
    public static void main(String[] args) {
        A a = new A(); //A 클래스 호출
        A2 a2 = new A2();
        Company company = Company.getInstance();
        a.a(company);
        a2.a2(company);
        //주소가 같음
        //싱글톤 적용 안 할시 각 클래스마다 매개변수 전달 해야 하는 번거로움이 있음
        //C2와 D클래스에 바로 넘겨서 사용 가능
    }
}
