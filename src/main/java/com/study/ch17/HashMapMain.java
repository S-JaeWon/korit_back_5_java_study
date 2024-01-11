package com.study.ch17;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("1번학생", "철수");
        map.put("2번학생", "민수");
        map.put("5번학생", "민수");
        map.put("3번학생", "영희");
        map.put("6번학생", "민희");
        map.put("7번학생", "민희");

        System.out.println(map);
        System.out.println(map.get("2번학생")); //키값 -> String
    }
}
