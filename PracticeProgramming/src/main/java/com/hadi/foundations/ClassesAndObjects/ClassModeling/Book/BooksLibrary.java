package com.hadi.foundations.ClassesAndObjects.ClassModeling.Book;

public class BooksLibrary {
    //Declare variables
    private String bookISIN;
    private String bookTitle;
    private String bookAuthor;
    private String genre;
    private String[] userEntry;

    //Constructor
    BooksLibrary(String isin) {
        this.bookISIN = isin;
    }

    //Setters


    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setUserEntry(String[] userEntry) {
        this.userEntry = userEntry;
    }

    //getters


    public String getBookISIN() {
        return bookISIN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getGenre() {
        return genre;
    }

    public String[] getUserEntry() {
        return userEntry;
    }

    //Add new user entry
    public void userEntry(){}
    //exit time of user
    public void userExit(){}
}
