package com.study.ch08.library;

public class BookRepository {
    Book[] books;
    BookRepository(Book[] books) {
        this.books = books;
    }

    int getEmptyCount() {
        int emptyCount = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                emptyCount++;
            }
        }
        return emptyCount;
    }
}
