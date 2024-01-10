package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor; //Nonnull 과 final 사용 가능

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Student2 {
    private final String name;
    private String address;
    @NonNull
    private  String phone;
}
