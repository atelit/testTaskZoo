package com.company;

import java.util.Date;

public class Wolf extends Animal implements Predator {
    public Wolf(String name, Date birthday) {
        setName(name);
        setBirthday(birthday);
    }

    @Override
    public String saySomething() {
        return "Woo-oo";
    }
}
