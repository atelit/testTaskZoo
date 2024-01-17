package com.company;

import java.util.*;

public class Zoo {
    private final Map<Integer, Animal> animals;  // integer is a serial number of Animal in thr Zoo

    public Zoo() {
        this.animals = new HashMap<Integer, Animal>();
    }

    public void addAnimal(Animal animal) {
        if (animals.isEmpty()) {
            animals.put(1, animal);
            animal.setSerialNumber(1);
        } else {
            animals.put(animals.size() + 1, animal);
            animal.setSerialNumber(animals.size());
        }

    }

    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animals.values());
    }
}
