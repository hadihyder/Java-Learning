package com.mthree.AddressBook.dao;

public class AddressBookDuplicateLastNameException extends Exception{
    public AddressBookDuplicateLastNameException(String message) {
        super(message);
    }

    public AddressBookDuplicateLastNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
