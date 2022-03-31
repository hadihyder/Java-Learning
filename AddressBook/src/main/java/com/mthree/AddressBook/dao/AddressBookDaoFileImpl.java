package com.mthree.AddressBook.dao;

import com.mthree.AddressBook.dto.Address;

import java.io.*;
import java.util.*;

public class AddressBookDaoFileImpl implements AddressBookDao{

    public static final String ADDRESS_FILE = "address.txt";
    public static final String DELIMITER = "::";

    private Map<String, Address> addresses = new HashMap<>();

    @Override
    public Address addAddress(String lastName, Address address) throws AddressBookDaoException, AddressBookDataValidationException, AddressBookDuplicateLastNameException {
        loadAddress();
        Address newAddress = addresses.put(lastName, address);
        writeAddress();
        return newAddress;
    }

    @Override
    public Address deleteAddress(String lastName) throws AddressBookDaoException {
        loadAddress();
        Address removeAddress = addresses.remove(lastName);
        writeAddress();
        return removeAddress;
    }

    @Override
    public Address findAddress(String lastName) throws AddressBookDaoException {
        loadAddress();
        return addresses.get(lastName);
    }

    @Override
    public int addressCount() throws AddressBookDaoException {
        loadAddress();
        return addresses.size();
    }

    @Override
    public List<Address> getAllAddresses() throws AddressBookDaoException {
        loadAddress();
        return new ArrayList<Address>(addresses.values());
    }

    private void loadAddress() throws AddressBookDaoException {

        Scanner sc;

        try {
            sc = new Scanner(
                    new BufferedReader(
                            new FileReader(ADDRESS_FILE)
                    )
            );
        } catch (FileNotFoundException e) {
            throw new AddressBookDaoException("Could not load address data into memory.", e);
        }

        String currentLine;

        Address currAddress;

        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();

            currAddress = unmarshallAddress(currentLine);

            addresses.put(currAddress.getLastName(), currAddress);
        }
        sc.close();
    }

    private void writeAddress() throws AddressBookDaoException {

        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ADDRESS_FILE));
        } catch (IOException e) {
            throw new AddressBookDaoException("Could not save address data", e);
        }

        String addressAsText;
        List<Address> addressList = this.getAllAddresses();

        for(Address currAddress: addressList) {

            addressAsText = marshallAddress(currAddress);
            out.println(addressAsText);

            out.flush();
        }
        out.close();
    }

    private String marshallAddress(Address address) {
        String addressAsText = address.getFirstName() + DELIMITER;

        addressAsText += address.getLastName() + DELIMITER;

        addressAsText += address.getStreetAddress() + DELIMITER;

        return addressAsText;
    }

    private Address unmarshallAddress(String addressAsText) {
        String[] addressTokens = addressAsText.split(DELIMITER);

        String lastName = addressTokens[1];

        Address addressFromFile = new Address(lastName);

        addressFromFile.setFirstName(addressTokens[0]);

        addressFromFile.setStreetAddress(addressTokens[2]);

        return addressFromFile;
    }


}
