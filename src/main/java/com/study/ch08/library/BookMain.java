package com.study.ch08.library;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seletedMenu = null;
        //Book book1 = null;
        Book[] books = new Book[3];
        while(true) {
            System.out.println("도서 관리 프로그램");
            System.out.println("1. 책 정보 등록");
            System.out.println("2. 책 정보 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("선택하기 -> " );

            seletedMenu = scanner.nextLine();

            int emptyCount = 0;
            if("1".equals(seletedMenu)) {
                System.out.println("책 정보 등록하기");
                String name = null;
                int code = 0;

                for(int i = 0; i < books.length; i++) {
                    if (books[i] == null) {
                        emptyCount++;
                    }
                }
                if (emptyCount == 0) {
                    System.out.println("더 이상 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("책 제목 >>> ");
                name = scanner.nextLine();
                System.out.print("책 코드 ex)20241111 >>> ");
                code = scanner.nextInt();
                scanner.nextLine(); //입력이 int 로 재출력이 막기위해 코드 기입 //https://gongstudyit.tistory.com/18

                Book book = new Book(name, code);

                for (int i = 0; i < books.length; i++) {
                    if (books[i] == null) {
                        books[i] = book;
                        break;
                    }
                }
            } else if ("2".equals(seletedMenu)) {
                System.out.println("책 정보 조회하기");
                for (int i = 0; i < books.length; i++) {
                    //System.out.println(books[i].toString());
                    System.out.println("[" + (i + 1) + "]: ");

                    if(books[i] == null){
                        System.out.println("X");
                        continue;
                    }
                    System.out.print(books[i].toString());
                }

            } else if("q".equalsIgnoreCase(seletedMenu)) {
                System.out.println("프로그램이 종료중");
                break;

            } else {
                System.out.println("다시 입력 해주세요.");
            }
            System.out.println("--------------------------");
        }
        System.out.println("프로그램이 종료되었습니다.");

    }
}
