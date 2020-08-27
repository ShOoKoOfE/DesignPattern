package com.shokoofe.adeli.designpattern.Creational.Builder;

public class User {
    String firstName;
    String lastName;
    int age;

    public User(final Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
    }


}
