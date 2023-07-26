package com.qa;

public class Bookstore {
    private final Book[] listBooks = new Book[20];
    private int numberBooks;
    public void addBook(Book newBook){
        listBooks[numberBooks] = newBook;
        numberBooks += 1;
    }

    private Boolean checkName(String name, String bookName) {
        return name.equals(bookName);
    }

    public Boolean checkAvailable(String name) {
        for (int i = 0; i < numberBooks; i++) {
            if (checkName(name, listBooks[i].getName())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public Bookstore() {
        numberBooks = 0;
    }
}
