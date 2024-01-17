package com.company;

import java.util.Date;
import java.util.Random;

public class Fox extends Animal implements Predator{
    final String[] song = {
            "Ring-ding-ding-ding-dingeringeding!",
            "Gering-ding-ding-ding-dingeringeding!",
            "Wa-pa-pa-pa-pa-pa-pow!",
            "Hatee-hatee-hatee-ho!",
            "Joff-tchoff-tchoffo-tchoffo-tchoff!",
            "Tchoff-tchoff-tchoffo-tchoffo-tchoff!"
    };
    public Fox(String name, Date birthday) {
        setName(name);
        setBirthday(birthday);
    }

    @Override
    public String saySomething() {
        return song[new Random().nextInt(song.length)];
    }
}

