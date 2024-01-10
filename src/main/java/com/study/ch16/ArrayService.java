package com.study.ch16;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayService {
    private String[] strArray;

    public void add(String str) { //배열추가
        //기존 배열 크기를 늘릴 수 없기에 함수가 호출 될때마다 확장하기 위해 새로 만들어야함
        String[] newArray = new String[strArray.length + 1];
        //새 배열에 기존 배열 자료를 옮겨준다.
        for(int i = 0; i < strArray.length; i++) {
           newArray[i] = strArray[i];
        }
        //그 후 주소를 새 배열의 것으로 바꿔준다.
        strArray = newArray;
        //length -1 -> 배열의 끝 인덱스 번호
        strArray[strArray.length - 1] = str;
    }

    public void remove(int index) {
        //칸 하나 적은 배열 생성
        //매개변수로 받은 인덱스의 값 기준으로 작은것은 그대로 옮기고 큰 것은 -1
        //새 주소로 바꿔줌
        String[] newArray = new String[strArray.length - 1];
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = strArray[i < index ? i : i + 1];

        }
        strArray = newArray;
    }


    public int indexOf(String str) { //인덱스 번호 찾기
        if(str == null) {
            return -1;
        } //null 체크
        for(int i = 0; i < strArray.length; i++) {
            if(strArray[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        String result = "Array[ ";
        for(int i = 0; i < strArray.length; i++) {
            result += strArray[i];
            if(i < strArray.length - 1) { //배열의 추가는 끝자락부터
                result +=", ";
            }
        }
        result += " ]";
        return  result;

    }

}
