package com.mthree.AddressBook.dao;



import com.mthree.AddressBook.dto.Address;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

public class AddressBookDaoFileImplTest {

    private AddressBookDao dao;

    public AddressBookDaoFileImplTest(){
        dao = new AddressBookDaoFileImpl();
    }

    @Test
    public void addAddress() throws AddressBookDataValidationException, AddressBookDaoException, AddressBookDuplicateLastNameException {
        Address testAddress = new Address("Bond");
        testAddress.setFirstName("John");
        testAddress.setStreetAddress("123 ABCD Street");

        dao.addAddress(testAddress.getLastName(), testAddress);
        Address addedAddress = dao.findAddress(testAddress.getLastName());
        assertEquals(addedAddress.getLastName(),testAddress.getLastName(),"Checking Last Name in Address");
        assertEquals(addedAddress.getFirstName(),testAddress.getFirstName(),"Checking First Name in Address");
        assertEquals(addedAddress.getStreetAddress(),testAddress.getStreetAddress(),"Checking Last Name in Address");
    }

    @Test
    public void deleteAddress() throws AddressBookDaoException, AddressBookDataValidationException, AddressBookDuplicateLastNameException {
        Address testAddress = new Address("Bond");
        testAddress.setFirstName("John");
        testAddress.setStreetAddress("123 ABCD Street");

        dao.addAddress(testAddress.getLastName(), testAddress);
        dao.deleteAddress(testAddress.getLastName());

        Address nullAddress = dao.findAddress(testAddress.getLastName());
        assertNull(nullAddress,"Address should be null");
    }

    @Test
    public void findAddress() throws AddressBookDataValidationException, AddressBookDaoException, AddressBookDuplicateLastNameException {
        Address testAddress = new Address("Bond");
        testAddress.setFirstName("John");
        testAddress.setStreetAddress("123 ABCD Street");

        dao.addAddress(testAddress.getLastName(), testAddress);
        Address foundAddress = dao.findAddress(testAddress.getLastName());

        assertEquals(foundAddress.getStreetAddress(), testAddress.getStreetAddress(),"Address should match");

    }

    @Test
    public void addressCount() throws AddressBookDataValidationException, AddressBookDaoException, AddressBookDuplicateLastNameException {
        Address testAddress = new Address("Bond");
        testAddress.setFirstName("John");
        testAddress.setStreetAddress("123 ABCD Street");

        dao.addAddress(testAddress.getLastName(), testAddress);

        assertEquals(1, dao.getAllAddresses().size(), "Count should be 1");
    }

    @Test
    public void getAllAddresses() throws AddressBookDataValidationException, AddressBookDaoException, AddressBookDuplicateLastNameException {
        Address testAddress = new Address("Bond");
        testAddress.setFirstName("John");
        testAddress.setStreetAddress("123 ABCD Street");

        dao.addAddress(testAddress.getLastName(), testAddress);
        assertEquals(1, dao.getAllAddresses().size(), "Count should be 1");
    }
}