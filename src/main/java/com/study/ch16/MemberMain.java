package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        String selectedMenu = null;

        while (true) {
            System.out.println("회원 관리 프로그램");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("3. 회원 이름으로 조회");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 회원 이름 수정");
            System.out.println("6. 회원 주소 수정");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 >> ");
            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if ("1".equals(selectedMenu)) {
                /*
                * [ 회원 등록하기 ]
                * 이름 >>> A
                * 주소 >>> abc
                * << 등록이 완료되었습니다.>>*/
                System.out.println("회원 등록하기");
                String name = null;
                String address = null;
                System.out.print("회원 이름 >>> ");
                name = scanner.nextLine();
                System.out.print("회원 주소 >>> ");
                address = scanner.nextLine();

                members.add(new Member(name, address));

                System.out.println("등록이 완료되었습니다.");

            } else if ("2".equals(selectedMenu)) {
                /*
                 * [ 회원 전체 조회하기 ]
                 * MemberList 전체 반복 toString();
                 * << 조회가 완료되었습니다. >>
                 */
                System.out.println("회원 전체 조회하기");
                //System.out.println(members);
                for(Member member : members) {
                    System.out.println(members.toString());
                }
            } else if ("3".equals(selectedMenu)) {
                /*
                 * [ 회원 이름으로 조회하기 ]
                 * 조회 할 회원의 이름을 입력하세요. >>> B
                 * 해당 이름의 회원 정보 없을시
                 * [ 존재 하지 않은 회원 이름입니다. ]
                 * Member 객체 toString();
                 * << 조회가 완료되었습니다. >>
                 */
                String name = null;
                name = scanner.nextLine();
                for(Member member : members) {
                    if(members.equals(name)){
                        System.out.println(members);
                    }
                }
                System.out.println("회원 이름으로 조회하기");

            } else if ("4".equals(selectedMenu)) {
                /*
                 * [ 회원 이름으로 삭제하기 ]
                 * 삭제 할 회원의 이름을 입력하세요. >>> B
                 * 삭제 된 Member 객체 toString();
                 * << 삭제가 완료되었습니다. >>
                 */

            } else if ("5".equals(selectedMenu)) {
                /*
                 * [ 회원 주소 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요. >>> B
                 * 주소 >>> def
                 * << 수정이 완료되었습니다. >>
                 */
            } else if ("6".equals(selectedMenu)) {
                /*
                 * [ 회원 이름 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요. >>> A
                 * 이름 >>> B
                 * << 수정이 완료되었습니다. >>
                 */
            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
