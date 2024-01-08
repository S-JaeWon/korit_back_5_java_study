package com.study.ch08.library;

public class Book {
    String name;
    int code;


    Book(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "책 정보<" +
                "제목='" + name + '\'' +
                ", 책 코드=" + code +
                ">";
    }
}
