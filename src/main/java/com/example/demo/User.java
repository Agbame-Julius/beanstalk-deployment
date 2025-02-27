package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private String firstName;
    private String lastName;
    private String chapter;
    private String location;

    public User(String firstName, String lastName, String chapter, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.chapter = chapter;
        this.location = location;
    }
}
