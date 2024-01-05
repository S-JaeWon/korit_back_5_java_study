package com.study.ch08;

public class Phone {
    String company;
    String modelname;

    Phone(String company, String modelname) {
        this.company = company;
        this.modelname = modelname;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", modelname='" + modelname + '\'' +
                '}';
    }
}
