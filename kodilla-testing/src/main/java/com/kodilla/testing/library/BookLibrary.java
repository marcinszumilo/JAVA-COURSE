package com.kodilla.testing.library;

import java.util.*;

public class BookLibrary {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> resultListOf0Books = new ArrayList<Book>();                           // [2]
        List<Book> resultListOf1Book = generateListOfNBooks(1);                       // [3]
        List<Book> resultListOf5Books = generateListOfNBooks(5);                       // [4]

        LibraryUser user1 = new LibraryUser("Marcin", "Szumilo", "73120312345");
        LibraryUser user2 = new LibraryUser("Erwin", "Muzyczuk", "71110154321");
        LibraryUser user3 = new LibraryUser("Michal", "Kowalski", "88021512321");

        if (libraryUser.equals(user1)) {
            return resultListOf0Books;
        }
        if (libraryUser.equals(user2)) {
            return resultListOf1Book;
        }
        if (libraryUser.equals(user3)) {
            return resultListOf5Books;
        }
        return resultListOf0Books;
    }
}