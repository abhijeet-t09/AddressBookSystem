package com.bridgelabz;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, AddressBook> map = new HashMap<>();
    static String currentAddressBook;
    static String addressBookName;
    static boolean isPresent = true;

    public static void main(String[] args) {
        System.out.println("***| Address Book System |***\n");

        while (isPresent) {

//            AddressBook addressBook = new AddressBook();
//            System.out.print("Enter Address Book Name: ");
//            String addressBookName = sc.next();
//
//            if(map.containsKey(addressBookName)){
//                System.out.println("Address Book Already Exists");
//            }
//            else {
//                map.put(addressBookName, addressBook);
//            }

            chooseAddressBook();

            System.out.println("\nSelect Operation....");
            System.out.println("1. Enter Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit Address Book");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {
                        map.get(currentAddressBook).addContact();
                    } catch (Exception e) {
                        System.out.println("\nNo AddressBook Found\n");
                    }
                    break;

                case 2:
                    try {
                        map.get(currentAddressBook).editContact();
                    } catch (Exception e) {
                        System.out.println("\nNo AddressBook Found\n");
                    }
                    break;

                case 3:
                    try {
                        map.get(currentAddressBook).deleteContact();
                    } catch (Exception e) {
                        System.out.println("\nNo AddressBook Found\n");
                    }
                    break;

                case 4:
                    try {
                        map.get(currentAddressBook).displayContact();
                    } catch (Exception e) {
                        System.out.println("\nNo AddressBook Found\n");
                    }
                    break;

                case 5:
                    isPresent = true;
                    break;
            }
//                case 1:
//                    map.get(addressBookName).addContact();
//                    break;
//                case 2:
//                    map.get(addressBookName).editContact();
//                    break;
//                case 3:
//                    map.get(addressBookName).deleteContact();
//                    break;
//                case 4:
//                    map.get(addressBookName).displayContact();
//                    break;
//                case 5:
//                    isOpen = false;
//                    break;
        }
        System.out.println(map);

//        addressBook.addContact();
//        System.out.println(addressBook.displayContact());
//        addressBook.editContact();
//        System.out.println(addressBook.displayContact());
//        addressBook.deleteContact();
//        System.out.println(addressBook.displayContact());
    }

    static void chooseAddressBook() {

        System.out.println("""
        Press 1 to add AddressBook
        Press 2 to select AddressBook""");

        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter Address Book Name");
                addressBookName = sc.next();

                if (map.containsKey(addressBookName)) {
                    System.out.println("\nAddress Book Already Exists\n");

                    while (isPresent){

                        System.out.println("\nSelect Operation....");
                        System.out.println("1. Enter Contact");
                        System.out.println("2. Edit Contact");
                        System.out.println("3. Delete Contact");
                        System.out.println("4. Display Contacts");
                        System.out.println("5. Exit Address Book");

                        int choice = sc.nextInt();

                        switch (choice) {

                            case 1:
                                try {
                                    map.get(currentAddressBook).addContact();
                                } catch (Exception e) {
                                    System.out.println("\nNo AddressBook Found\n");
                                }
                                break;

                            case 2:
                                try {
                                    map.get(currentAddressBook).editContact();
                                } catch (Exception e) {
                                    System.out.println("\nNo AddressBook Found\n");
                                }
                                break;

                            case 3:
                                try {
                                    map.get(currentAddressBook).deleteContact();
                                } catch (Exception e) {
                                    System.out.println("\nNo AddressBook Found\n");
                                }
                                break;

                            case 4:
                                try {
                                    map.get(currentAddressBook).displayContact();
                                } catch (Exception e) {
                                    System.out.println("\nNo AddressBook Found\n");
                                }
                                break;

                            case 5:
                                isPresent = true;
                                break;
                        }
                    }

                } else {
                    AddressBook addressBook = new AddressBook();
                    map.put(addressBookName, addressBook);
                    currentAddressBook = addressBookName;
                }
                break;

            case 2:
                System.out.println("Enter Address Book Name");
                addressBookName = sc.next();

                if (!map.containsKey(addressBookName)) {
                    System.out.println("\nAddress Book Not Found\n");
                    chooseAddressBook();
                } else
                    currentAddressBook = addressBookName;
                break;
        }
    }
}
