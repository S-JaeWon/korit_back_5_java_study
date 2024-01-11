package com.study.ch08.library;

import com.study.ch08.car.Car;

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

    int getEmptyIndex() {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                return i;
            }
        }
        return -1;
    }

    void insert(Book book) {
        books[getEmptyIndex()] = book;
    }
}
