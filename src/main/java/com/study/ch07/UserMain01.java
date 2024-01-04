package com.study.ch07;

public class UserMain01 {
    public static void main(String[] args) {
        User01 user1 = new User01("abc", 123);
        User01 user2 = new User01("abc", 123, "심재원", "abc@abc.com");

        user1.showInfo();
        System.out.println("----------------------");

        user2.showInfo();
        System.out.println("----------------------");

        user1.setName("심재원");
        user1.setEmail("123@123.com");
        user1.showInfo();


    }
}
