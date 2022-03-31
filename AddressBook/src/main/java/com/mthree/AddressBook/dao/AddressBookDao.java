package com.mthree.AddressBook.dao;

import com.mthree.AddressBook.dto.Address;

import java.util.List;

public interface AddressBookDao {

    Address addAddress(String lastName, Address address) throws AddressBookDaoException, AddressBookDataValidationException, AddressBookDuplicateLastNameException;

    Address deleteAddress(String lastName) throws AddressBookDaoException;

    Address findAddress(String lastName) throws AddressBookDaoException;

    int addressCount() throws AddressBookDaoException;

    List<Address> getAllAddresses() throws AddressBookDaoException;
}
