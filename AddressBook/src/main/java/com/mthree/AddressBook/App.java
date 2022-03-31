package com.mthree.AddressBook;

import com.mthree.AddressBook.controller.AddressBookController;
import com.mthree.AddressBook.dao.AddressBookDao;
import com.mthree.AddressBook.dao.AddressBookDaoFileImpl;
import com.mthree.AddressBook.ui.AddressBookView;
import com.mthree.AddressBook.ui.UserIO;
import com.mthree.AddressBook.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
       UserIO myIO = new UserIOConsoleImpl();
        AddressBookView myView = new AddressBookView(myIO);
        AddressBookDao myDao = new AddressBookDaoFileImpl();

        AddressBookController controller = new AddressBookController(myDao, myView);

        controller.run();
    }
}
