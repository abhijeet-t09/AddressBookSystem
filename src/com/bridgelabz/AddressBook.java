package com.bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contacts> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void addContact(){
        System.out.println("Enter First Name");
        String firstName = scanner.next().toLowerCase();
        System.out.println("Enter Last Name");
        String lastName = scanner.next().toLowerCase();

        for (Contacts contacts : list) {
            if ((contacts.getFirstName().toLowerCase().equals(firstName)) && (contacts.getLastName().toLowerCase().equals(lastName))) {
                System.out.println("Contact Already Exists");
                return;
            }
        }

        Contacts contact = new Contacts();

        System.out.print("Enter First Name: ");
        contact.setFirstName(scanner.next());

        System.out.print("Enter Last Name: ");
        contact.setLastName(scanner.next());

        System.out.print("Enter Phone Number: ");
        contact.setPhoneNumber(scanner.next());

        System.out.print("Enter Email-ID: ");
        contact.setEmail(scanner.next());

        System.out.print("Enter address: ");
        contact.setAddress(scanner.next());

        System.out.print("Enter City: ");
        contact.setCity(scanner.next());

        System.out.print("Enter State: ");
        contact.setState(scanner.next());

        System.out.print("Enter Zip-code: ");
        contact.setZip(scanner.next());

        list.add(contact);
    }

    void editContact() {
        if (list.isEmpty()) {
            System.out.println("Address Book is Empty");
        }
        else {
            System.out.print("\nEnter First Name: ");
            String firstName = scanner.next().toLowerCase();
            System.out.print("\nEnter Last Name: ");
            String lastName = scanner.next().toLowerCase();

            for (Contacts contact : list) {

                if (firstName.equals(contact.getFirstName())) {
                    if (lastName.equals(contact.getLastName())) {

                        System.out.println("\nContact Found\n");
                        System.out.println("Edit Contact Details....\n");

                        System.out.print("Enter First Name: ");
                        contact.setFirstName(scanner.next());

                        System.out.print("Enter Last Name: ");
                        contact.setLastName(scanner.next());

                        System.out.print("Enter Phone Number: ");
                        contact.setPhoneNumber(scanner.next());

                        System.out.print("Enter Email-ID: ");
                        contact.setEmail(scanner.next());

                        System.out.print("Enter address: ");
                        contact.setAddress(scanner.next());

                        System.out.print("Enter City: ");
                        contact.setCity(scanner.next());

                        System.out.print("Enter State: ");
                        contact.setState(scanner.next());

                        System.out.print("Enter Zip-code: ");
                        contact.setZip(scanner.next());
                        break;
                    }
                } else
                    System.out.println("Contact Not Found");
            }
        }
    }

    void deleteContact() {
        if (list.isEmpty()) {
            System.out.println("Address Book is Empty");
        }
        else {
            System.out.print("\nEnter First Name: ");
            String firstName = scanner.next().toLowerCase();
            System.out.print("\nEnter Last Name: ");
            String lastName = scanner.next().toLowerCase();

            for (Contacts contact : list) {

                if (firstName.equals(contact.getFirstName())) {
                    if (lastName.equals(contact.getLastName())) {

                        list.remove(contact);
                        System.out.println("Contact Deleted Successfully");
                        break;
                    }
                } else
                    System.out.println("Contact Not Found");
            }
        }
    }

    void displayContact(){

        if(list.isEmpty()){
            System.out.println("Address Book is Empty");
        }
        else {
            for (Contacts contact : list) {
                System.out.println(contact);
            }
        }
    }
}
