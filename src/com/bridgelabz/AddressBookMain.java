package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("***| Address Book System |***\n");

        HashMap<String, AddressBook> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean isOpen = true;

        while (isOpen) {

            AddressBook addressBook = new AddressBook();
            System.out.print("Enter Address Book Name: ");
            String addressBookName = sc.next();

            if(map.containsKey(addressBookName)){
                System.out.println("Address Book Already Exists");
            }
            else {
                map.put(addressBookName, addressBook);
            }

            System.out.println("\nSelect Operation....");
            System.out.println("1. Enter Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit Address Book");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    map.get(addressBookName).addContact();
                    break;
                case 2:
                    map.get(addressBookName).editContact();
                    break;
                case 3:
                    map.get(addressBookName).deleteContact();
                    break;
                case 4:
                    map.get(addressBookName).displayContact();
                    break;
                case 5:
                    isOpen = false;
                    break;

            }
        }
        System.out.println(map);

//        addressBook.addContact();
//        System.out.println(addressBook.displayContact());
//        addressBook.editContact();
//        System.out.println(addressBook.displayContact());
//        addressBook.deleteContact();
//        System.out.println(addressBook.displayContact());
    }
}
