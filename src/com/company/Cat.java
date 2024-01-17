package com.company;

import java.util.Date;

public class Cat extends Animal implements Predator {

    public Cat(String name, Date birthday) {
        setName(name);
        setBirthday(birthday);
    }

    @Override
    public String saySomething() {
        return "Meow";
    }
}
