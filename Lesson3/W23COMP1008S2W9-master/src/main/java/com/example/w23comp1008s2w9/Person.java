package com.example.w23comp1008s2w9;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName, lastName, address;
    private LocalDate birthday;

    public Person(String firstName, String lastName, String address, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setBirthday(birthday);
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * This method will ensure that each name does not have leading or trailing
     * white spaces and the first letter is capitalized
     * @param name
     * @return
     */
    private String formatName(String name)
    {
        name = name.trim();   //remove any leading or trailing white spaces
        return name.substring(0,1).toUpperCase()+name.substring(1);
    }

    public void setFirstName(String firstName) {
        firstName = formatName(firstName);
        if (firstName.length()>=2)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("first name must be 2 or more characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = formatName(lastName);
        if (lastName.length()>=2)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("last name must be 2 or more characters");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address.trim();
        if (address.length()>=10)
            this.address = address;
        else
            throw new IllegalArgumentException("address must be 10 or more characters");
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("birthday cannot be in the future");
        else
            this.birthday = birthday;
    }

    public int getAge()
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public String toString()
    {
        return String.format("%s %s age: %d years",firstName,lastName,getAge());
    }
}
