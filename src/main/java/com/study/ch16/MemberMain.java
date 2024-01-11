package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;
//TODO ArrayList
public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>(); // 2)에서 ArrayList<Member> members 내용을 생략 하기위에 main문 밖으로 꺼내줌

    //각 기능에 동일한 내용이 있는 코드가 있으므로 함수로 묶어서 빼준다.
    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(label + " >> ");
        return scanner.nextLine(); //찾은 이름 String 타입으로 리턴값으로 반환
    }

    //public static Member findMemberByName(ArrayList<Member> members, String name) {} 1)매개변수가 main문 안에 있으므로 따로 적어줘야 함 )
    public static Member findMemberByName(String name) {
        for(Member member : members) {
            if(member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Member> members = new ArrayList<>();
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
                //members.add(new Member(name, address));

                //정보 받고 멤버 객체 생성
                Member member = new Member(name, address);
                //리스트에 넣기
                members.add(member);

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
                    System.out.println(member.toString());
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
                String searchname = null;
                System.out.println("회원 이름으로 조회하기");

                /*System.out.print("회원 이름 입력 >>> ");
                searchname = scanner.nextLine(); 함수로 빼기*/
                searchname = inputSearchName("회원 이름 입력 >>> ");

                //members.indexOf() -> 주소 넣고 인덱스 번호 찾기, 이걸로 찾기 x

                /*Member findmember = null;
                for(Member member : members) {
                    if(member.getName().equals(searchname)) {
                        findmember = member;
                        break;
                    }
                } 함수로 빼기 */
                Member findmember = findMemberByName(searchname);

                if(findmember == null) {
                    System.out.println("존재 하지 않은 회원 이름입니다.");
                    System.out.println();
                    continue;
                }
                System.out.println(findmember);

            } else if ("4".equals(selectedMenu)) {
                /*
                 * [ 회원 이름으로 삭제하기 ]
                 * 삭제 할 회원의 이름을 입력하세요. >>> B
                 * 삭제 된 Member 객체 toString();
                 * << 삭제가 완료되었습니다. >>
                 */
                String searchname = null;
                System.out.println("회원 이름으로 삭제하기");
                System.out.print("회원 이름 입력 >>> ");
                searchname = scanner.nextLine();

                Member findmember = null;
                for(Member member : members) {
                    if(member.getName().equals(searchname)) {
                        findmember = member;
                        break;
                    }
                }
                if(findmember == null) {
                    System.out.println("존재 하지 않은 회원 이름입니다.");
                    System.out.println();
                    continue;
                } // 여기까지 3번이랑 코드랑 같음
                //해당 객체를 찾았으면 해당 정보 삭제
                //members.remove(members.indexOf(findMember)); -> 인덱스 번호로 찾아서 제거
                members.remove(findmember); //해당 주소로 찾아서 제거
                System.out.println("삭제가 완료 되었습니다.");

            } else if ("5".equals(selectedMenu)) {
                /*
                 * [ 회원 주소 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요. >>> B
                 * 주소 >>> def
                 * << 수정이 완료되었습니다. >>
                 */
                System.out.println("회원 이름 수정하기");
                String searchname = inputSearchName("회원 이름 입력 >>> ");
                Member findMember = findMemberByName(searchname);
                if(findMember == null) {
                    System.out.println("존재 하지 않은 회원 이름입니다.");
                    continue;
                }
                System.out.print("이름 >>> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName); //findMember에 있는 이름을 updateName 값으로 변경

            } else if ("6".equals(selectedMenu)) {
                /*
                 * [ 회원 이름 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요. >>> A
                 * 이름 >>> B
                 * << 수정이 완료되었습니다. >>
                 */
                System.out.println("회원 주소 수정하기");
                String searchname = inputSearchName("회원 이름 입력 >>> ");
                Member findMember = findMemberByName(searchname);
                if(findMember == null) {
                    System.out.println("존재 하지 않은 회원 이름입니다.");
                    continue;
                }
                System.out.print("주소 >>> ");
                String updateAddress = scanner.nextLine();
                findMember.setAddress(updateAddress);

            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
