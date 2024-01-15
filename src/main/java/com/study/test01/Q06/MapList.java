package com.study.test01.Q06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

   public static void main(String[] args) {

       List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();

       Map<String, Object>map = new HashMap<String, Object>();
       map.put("name", "홍길동");
       map.put("rating", "vip");
       map.put("age", "30");
       customers.add(map);

       Map<String, Object>map1 = new HashMap<String, Object>();
       map1.put("name", "김기영");
       map1.put("rating", "gold");
       map1.put("age", "35");
       customers.add(map1);

       for (Map<String, Object> customer : customers) {
           System.out.println(customer.get("name") + "");
           System.out.println(customer.get("rating") + "");
           System.out.println(customer.get("age") + "");
       }
    }
}

/*
* name = 홍길동
* rating = vip
* age = 30
* name = 김기영
* raing = gold
* age = 35
* */