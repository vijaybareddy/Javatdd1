package com.neoteric.javatdd1.model.Student;

public class Address {
    public    String street;
    public    String flatNo;
    public    String pinCode;
    public    String city;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
