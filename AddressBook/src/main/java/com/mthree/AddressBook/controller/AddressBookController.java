package com.mthree.AddressBook.controller;

import com.mthree.AddressBook.dao.AddressBookDao;
import com.mthree.AddressBook.dao.AddressBookDaoException;
import com.mthree.AddressBook.dao.AddressBookDataValidationException;
import com.mthree.AddressBook.dao.AddressBookDuplicateLastNameException;
import com.mthree.AddressBook.dto.Address;
import com.mthree.AddressBook.ui.AddressBookView;

import java.util.List;

public class AddressBookController {

    private AddressBookView view;
    private AddressBookDao dao;

    public AddressBookController(AddressBookDao dao, AddressBookView view) {
        this.view  = view;
        this.dao = dao;
    }
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
                menuSelection = getMenuSelection();
                switch (menuSelection) {
                    case 1:
                        createAddress();
                        break;
                    case 2:
                        deleteAddress();
                        break;
                    case 3:
                        findAddress();
                        break;
                    case 4:
                        addressCount();
                        break;
                    case 5:
                        allAddresses();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        }catch (AddressBookDaoException | AddressBookDataValidationException | AddressBookDuplicateLastNameException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
       return view.printMenuAndGetSelection();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void allAddresses() throws AddressBookDaoException {
        view.displayAllAddressesBanner();
        List<Address> addressList = dao.getAllAddresses();
        view.displayAddressList(addressList);
        view.displayAddressListSuccessfully();
    }

    private void addressCount() throws AddressBookDaoException {
        view.displayAddressCountBanner();
        int count = dao.addressCount();
        view.displayAddressCount(count);
    }

    private void deleteAddress() throws AddressBookDaoException {
        view.deleteAddressBanner();
        String lastName = view.getLastName();
        Address address = dao.deleteAddress(lastName);
        view.displaySuccessfullyDeleted();
    }

    private void findAddress() throws AddressBookDaoException {
        view.findAddressBanner();
        String lastName = view.getLastName();
        Address address = dao.findAddress(lastName);
        view.displayAddress(address);
    }

    private void createAddress() throws AddressBookDaoException, AddressBookDataValidationException, AddressBookDuplicateLastNameException {
        view.displayAddAddressBanner();
        Address newAddress = view.getNewAddressInfo();
        dao.addAddress(newAddress.getLastName(), newAddress);
        view.displayAddressAddedBanner();
    }
}
