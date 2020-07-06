package com.javanibble.maven.examples.mapstruct.model;


import java.util.Date;


public class PersonCommand {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String contactEmail;
    private boolean isFirstYear;

    public PersonCommand() {
    }

    public PersonCommand(long id, String firstName, String lastName, String gender, Date birthDate, String contactEmail, boolean isFirstYear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.contactEmail = contactEmail;
        this.isFirstYear = isFirstYear;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public boolean isFirstYear() {
        return isFirstYear;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setFirstYear(boolean firstYear) {
        isFirstYear = firstYear;
    }
}
