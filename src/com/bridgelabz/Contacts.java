package com.bridgelabz;

public class Contacts {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emailID;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setPhoneNumber(String  phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String emailID) {
        this.emailID = emailID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zipCode) {
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return "\nContact Details [" +
                "Name -> " + firstName + " " + lastName +
                " | Phone Number -> " + phoneNumber +
                " | Email-ID -> " + emailID +
                " | Address -> " + address +
                " | City -> " + city +
                " | State -> " + state +
                " | Zip-code -> " + zipCode + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


//    public Contacts (String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String emailID){
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.address = address;
//        this.city = city;
//        this.state = state;
//        this.zipCode = zipCode;
//        this.phoneNumber = phoneNumber;
//        this.emailID = emailID;
//    }
//
//    public Contacts(){}

}
