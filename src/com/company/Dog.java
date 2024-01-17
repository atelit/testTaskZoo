package com.company;

import java.util.Date;

public class Dog extends Animal implements Predator {

    public Dog(String name, Date birthday) {
        setName(name);
        setBirthday(birthday);
    }

    @Override
    public String saySomething() {
        return "Woof";
    }
}
