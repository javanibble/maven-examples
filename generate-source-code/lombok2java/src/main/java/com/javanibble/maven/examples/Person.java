package com.javanibble.maven.examples;


import lombok.Data;
import java.util.Date;


@Data
public class Person {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private String contactEmail;
    private boolean isFirstYear;
}
