package com.company;

public class Reader {
    String fullName;
    int libraryCard;
    String faculty;
    double birthday;
    int phone;

    Reader(String fullName, int libraryCard, String faculty, double birthday, int phone) {
        this.fullName = fullName;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phone = phone;
    }

    public void takeBook(Book book1, Book book3) {
        System.out.println(fullName + " взял книгу");
    }

    public void returnBook() {
        System.out.println(fullName + " вернул книгу");
    }

    public void takeBook(int book) {
        System.out.println(fullName + " взял " + book + " книги.");
    }

    public void takeBook(Book... books) {

        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.nameBook + ", ");
        }
    }

    public void returnBook(int book) {
        System.out.println(fullName + " вернул " + book + " книги.");
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.nameBook + ", ");
        }
    }

}
