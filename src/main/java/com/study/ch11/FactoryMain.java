package com.study.ch11;

import java.lang.reflect.Constructor;

public class FactoryMain {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("삼성");
        /*company.showCompanyInfo();

        SmasungCompany.name = "애플";
        //SmasungCompany smasungCompany = new SmasungCompany(); 힙 메모리를 생성해서 따로 할당해야 사용 가능
        SmasungCompany.showCoompanyInfo(); //static을 붙임으로써 스택 메모리에 할당*/

        Phone phone1 = new Phone(company);
        Phone phone2 = new Phone(company);
        Phone phone3 = new Phone(company);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);


    }
}
