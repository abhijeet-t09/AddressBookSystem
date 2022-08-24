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

    public void setLastName(String lastName) {
        this.lastName = lastName;
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



    public String getFirstName() {
        return firstName;
    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String  getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public String getEmail() {
//        return emailID;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getState() {
//        return state;
//    }
//    public String getZip() {
//        return zipCode;
//    }


    @Override
    public String toString() {
        return "Contact Details [" +
                "Name -> " + firstName + " " + lastName +
                " | Phone Number -> " + phoneNumber +
                " | Email-ID -> " + emailID +
                " | Address -> " + address +
                " | City -> " + city +
                " | State -> " + state +
                " | Zip-code -> " + zipCode + "]";
    }

}
