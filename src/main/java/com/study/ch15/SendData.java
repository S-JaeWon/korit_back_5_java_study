package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SendData<T> {
    private int code;
    /*private String data;
    private Member data;
    // String -> sendData1 Member -> sendData2 / 둘 중 하나 밖에 안되지만 Object 자료형으로 둘다 사용 가능*/
    //private Object data;
    private T data;
    //제네릭 -> 자료형 변경 가능

    //메소드, 리턴값x 메소드명
    public void send() {
        System.out.println("[데이터 전송]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}
