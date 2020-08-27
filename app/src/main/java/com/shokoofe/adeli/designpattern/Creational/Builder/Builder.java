package com.shokoofe.adeli.designpattern.Creational.Builder;

public class Builder {
    String firstName;
    String lastName;
    int age;

    public Builder setFirstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Builder setLastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Builder setAge(final int age) {
        this.age = age;
        return this;
    }

    public User create() {
        //return new User(this);
        User user = new User(this);
        if (user.firstName.isEmpty()) {
            throw new IllegalStateException("First name can not be empty!");
        }
        return user;
    }
}
