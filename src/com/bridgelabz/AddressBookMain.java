package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("***| Address Book System |***\n");

        Contacts contact = new Contacts();

        contact.setFirstName("Abhijeet");
        contact.setLastName("Tripathi");
        contact.setAddress("E-45W");
        contact.setCity("New Delhi");
        contact.setState("Delhi");
        contact.setZip("110087");
        contact.setPhoneNumber("(+91) 8374738273");
        contact.setEmail("abhijeet@bridgelabz.com");

        System.out.println(contact.getFirstName() + " " +contact.getLastName());
        System.out.println(contact.getPhoneNumber());
        System.out.println(contact.getEmail());
        System.out.println(contact.getAddress() + ",");
        System.out.println(contact.getCity() + ", " + contact.getState());
        System.out.println(contact.getZip());

    }
}
