package com.study.ch15;

public class SendMain {
    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData(200, "심재원");
        //send(sendData1);
        SendData<Member> sendData2 = new SendData(200, new Member("심재원", "01051704834"));
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("철수", "0101234567"));
        send(sendData3);
    }
    //<?>: 와일드카드 자료형 구분 x
    //<?> extends ~~~: ~~~를 상속된 자료형만 가능
    //<?> super ~~~: ~~~와 부모클래스자료형만 가능
    public static void send(SendData<? super VipMember> sendData) {
        sendData.send();
    }
}
