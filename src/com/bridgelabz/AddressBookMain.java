package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("***| Address Book System |***\n");

        AddressBook addressBook = new AddressBook();

        addressBook.addContact();
        System.out.println(addressBook.displayContact());


        addressBook.editContact();
        System.out.println(addressBook.displayContact());
    }
}
