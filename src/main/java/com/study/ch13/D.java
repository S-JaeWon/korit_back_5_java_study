package com.study.ch13;

public class D {
    // (1)Company를 쓰기 Company company 위해 매개변수를 받아옴
    public void d(Company company) {
        System.out.println("<< D 클래스 >>");
        //A클래스에서 받아온 company 출력
        System.out.println(company);

    }
}
