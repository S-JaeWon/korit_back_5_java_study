package com.study.ch17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("철수");
        nameList.add("철수");
        nameList.add("영희");
        nameList.add("영희");
        System.out.println(nameList);

        //set, 순서x 중복x
        //중복 제거용으로 set 사용 가능
        HashSet<String> names = new HashSet<>();
        names.addAll(nameList);
        System.out.println(names); //중복된 내용 삭제 됨. collection 으로 상속이 되어있음.

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        newNameList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        System.out.println(newNameList.get(1));


        String findName = null;
        for(String name : names) {
            if(name.equals("민수")) {
                findName = name;
                break;
            }
        }
        System.out.println(findName);
    }
}
