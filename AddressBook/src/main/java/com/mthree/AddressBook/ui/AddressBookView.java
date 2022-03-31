package com.mthree.AddressBook.ui;

import com.mthree.AddressBook.dto.Address;

import java.util.List;

public class AddressBookView {

    private UserIO io;

    public AddressBookView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {

        io.print("============");
        io.print("Initial Menu:");
        io.print("\tPlease select the operation you wish to perform: ");
        io.print("\t 1. Add Address");
        io.print("\t 2. Delete Address");
        io.print("\t 3. Find Address");
        io.print("\t 4. List Address Count");
        io.print("\t 5. List All Address");
        io.print("\t 6. Exit");

        return io.readInt("Please select from the above choices. ", 1, 6);
    }

    public void displayAddAddressBanner() {
        io.print("Add Address Menu: ");
    }

    public Address getNewAddressInfo() {
        String firstName = io.readString("\tPlease Enter First Name: ");
        String lastName = io.readString("\tPlease Enter Last Name: ");
        String address = io.readString("\tPlease Enter Street Address: ");

        Address currAddress = new Address(lastName);
        currAddress.setFirstName(firstName);
        currAddress.setStreetAddress(address);

        return currAddress;
    }

    public void displayAddressAddedBanner() {
        io.readString("\tAddress added. Press 1 to go to Main Menu");
    }

    public void deleteAddressBanner() {
        io.print("Delete Address Menu: ");
    }
    public String getLastName(){
        return io.readString("Please enter Last Name of address: ");
    }
    public void displaySuccessfullyDeleted(){
        io.readString("Really Delete? \n Address Deleted. Press 1 to go to Main Menu");
    }

    public void findAddressBanner() {
        io.print("Find Address Menu: ");
    }

    public void displayAddress(Address address) {
        if(address != null) {
            io.print(address.getFirstName() + " " + address.getLastName());
            io.print(address.getStreetAddress());
        } else {
            io.print("No such address found!");
        }
        io.readString("Press 1 to go to Main Menu");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayAddressCountBanner(){
        io.print("List Address Count Menu: ");
    }

    public void displayAddressCount(int count) {
        io.print("There are " + count + " addresses in the book.");
        io.readString("Press 1 to go to Main Menu");
    }
    public void displayAllAddressesBanner(){
        io.print("List Addresses Menu: ");
    }

    public void displayAddressList(List<Address> addresses) {
        for(Address currAddress: addresses) {
            String addressInfo = String.format("%s %s \n%s",
                    currAddress.getFirstName(),
                    currAddress.getLastName(),
                    currAddress.getStreetAddress());
            io.print(addressInfo);
        }
    }
    public void displayAddressListSuccessfully() {
        io.readString("Press 1 to go to Main Menu");
    }

    public void displayErrorMessage(String message) {
        io.print("Error: ");
        io.print(message);
    }
}
