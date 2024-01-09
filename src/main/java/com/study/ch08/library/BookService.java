package com.study.ch08.library;

public class BookService {
    BookRepository bookRepository; //클래스 클래스명

    BookService(BookRepository bookRepository) { // 생성자
        this.bookRepository = bookRepository;
    }

    boolean isFull() {
        int emptyCount = 0;
        for(int i = 0; i < bookRepository.books.length; i++) {
            if (bookRepository.books[i] == null) {
                emptyCount++;
            }
        }
        return emptyCount == 0 ;
    }
}
