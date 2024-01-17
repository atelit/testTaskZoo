package com.company;

import java.util.Date;

public class Rabbit extends Animal implements Herbivore {
    public Rabbit(String name, Date birthday) {
        setName(name);
        setBirthday(birthday);
    }

    @Override
    public String saySomething() {
        return "[keeping silence]";
    }
}
