package com.study.ch16;

public class ArrayMain {
    public static void main(String[] args) {
        String[] initStrArray = new String[0];
        ArrayService arrayService = new ArrayService(initStrArray); //arrayService로 inisStrArray 배열 넘겨줌
        arrayService.add("심재원");
        arrayService.add("A");
        arrayService.add("B");
        arrayService.add("C");
        arrayService.add("D");
        arrayService.add("E");

        System.out.println(arrayService.toString());

        System.out.print(">>> ");
        System.out.println(arrayService.indexOf("C"));

    }
}
