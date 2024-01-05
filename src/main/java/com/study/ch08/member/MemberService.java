package com.study.ch08.member;

import java.util.Scanner;

public class MemberService {

    //inputValue 라는 함수로 묶어서 빼냄
    String inputValue(String label) {
        Scanner scanner = new Scanner(System.in);
        String value = null;
        while (true) {
            System.out.print(label + "(입력취소: exit) >>>");
            value = scanner.nextLine();
            if (!value.isBlank()) {
                break;
            }
        }
        return  value;
    }

    boolean addMember(Member[] members) {
        Scanner scanner = new Scanner(System.in);
        String code = null;
        String name = null;
        String age = null;
        String address = null;

        System.out.println("<<< 회원 등록 >>>");
        code = inputValue("회원코드");
        //이 기능은 함수로 묶어서 빼낼 수 없음. 각 값마다 false를 return 해주어야 함
        if("exit".equalsIgnoreCase(code)) {
            return false;
        }
        name = inputValue("이름");
        if("exit".equalsIgnoreCase(name)) {
            return false;
        }
        age = inputValue("나이");
        if("exit".equalsIgnoreCase(age)) {
            return false;
        }
        address = inputValue("주소");
        if("exit".equalsIgnoreCase(address)) {
            return false;
        }


        Member member = new Member(code, name, Integer.parseInt(age), address);

        MemberRepository memberRepository = new MemberRepository();

        return memberRepository.insert(members, member) > 0; //insert 호출 함수 -> 등록 성공시 1 return
   }
}
