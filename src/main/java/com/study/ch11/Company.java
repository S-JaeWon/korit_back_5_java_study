package com.study.ch11;

public class Company {
    String name;

    void setName(String name) {
        this.name = name;
    } //Main문 -> company.setName("삼성"); ()괄호 안에 값 넣자마자 생성 가능
      //생성자가 없다면 Main문 -> company.name = "삼성" 값을 넣어줘야함

    void showCompanyInfo() {
        System.out.println("회사명: " + name);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
