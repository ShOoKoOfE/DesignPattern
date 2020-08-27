package com.shokoofe.adeli.designpattern.Creational.Builder;

public class GenerateUser {
    User user = new Builder()
            .setFirstName("shokoofe")
            .setLastName("adeli")
            .setAge(35)
            .create();
}
