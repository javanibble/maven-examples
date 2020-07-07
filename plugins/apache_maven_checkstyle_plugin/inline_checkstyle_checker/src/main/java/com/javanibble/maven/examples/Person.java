package com.javanibble.maven.examples;

import java.util.*;

public class Person {

    public Person(final String firstname, final String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    private String firstname = "";
    private String surname = "";

}
