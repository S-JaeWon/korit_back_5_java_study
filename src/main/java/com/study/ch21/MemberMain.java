package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    public static void main(String[] args) {
            ArrayList<Member> members = new ArrayList<>();
            members.add(Member.builder().name("A").build());
            members.add(Member.builder().name("B").build());
            members.add(Member.builder().name("C").build());
            members.add(Member.builder().name("D").build());

            MemberService memberService = new MemberServiceImpl();
        try {
            memberService.printMemberList(members);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");

    }

}
