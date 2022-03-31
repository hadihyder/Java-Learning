package com.hadi.foundations.ClassesAndObjects.ClassModeling.Book;

public class BookPublisher {
    //Declare variables
    private String title;
    private String author;
    private String genre;
    private int year;

    //Constructor
    BookPublisher(String title) {
        this.title = title;
    }

    //Setters


    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Getter

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    //calculate total no of pages
    public void totalPages(){}
    //calculate total words
    public void totalWords(){}
}
