package com.mthree.AddressBook.dao;

public class AddressBookDataValidationException extends Exception{

    public AddressBookDataValidationException(String message) {
        super(message);
    }

    public AddressBookDataValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
