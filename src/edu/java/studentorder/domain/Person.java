package edu.java.studentorder.domain;

import java.time.LocalDate;

public abstract class Person {

    private String firstName;

    private String lastName;

    private String middleName;

    private LocalDate birthDate;

    private Address address;

    public Person() {
        System.out.println("Person is created ");
    }

    public String getPersonString() {
        return new String(firstName + " " + lastName + " " + middleName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
