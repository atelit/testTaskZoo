package com.company;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

import static java.util.Calendar.*;

public class Main {

    public static void main(String[] args) {

    /*
    Tasks:
    - using existing classes and interfaces and with common sense create dependencies
    - create two instances of each animal and put all of them in the List
    - create Zoo and put all animals in it

    - get from Zoo all Predators, call saySomething() for each of them
    - verify that in Zoo there are any Cat with age more than 5 year
    */

        // Solution
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Cat1", new GregorianCalendar(2022, JANUARY, 1).getTime()));
        animalList.add(new Cat("Cat2", new GregorianCalendar(2015, MARCH, 2).getTime()));
        animalList.add(new Dog("Dog1", new GregorianCalendar(2017, FEBRUARY, 3).getTime()));
        animalList.add(new Dog("Dog2", new GregorianCalendar(2018, MAY, 4).getTime()));
        animalList.add(new Rabbit("Rabbit1", new GregorianCalendar(2023, JUNE, 5).getTime()));
        animalList.add(new Rabbit("Rabbit2", new GregorianCalendar(2023, AUGUST, 6).getTime()));
        animalList.add(new Wolf("Wolf1", new GregorianCalendar(2014, JULY, 7).getTime()));
        animalList.add(new Wolf("Wolf2", new GregorianCalendar(2020, SEPTEMBER, 8).getTime()));
        animalList.add(new Fox("Fox", new GregorianCalendar(2020, SEPTEMBER, 8).getTime()));
        animalList.add(new Fox("Fox2", new GregorianCalendar(2020, SEPTEMBER, 8).getTime()));
        animalList.add(new Fox("Fox3", new GregorianCalendar(2020, SEPTEMBER, 8).getTime()));
        animalList.add(new Fox("Fox4", new GregorianCalendar(2020, SEPTEMBER, 8).getTime()));

        Zoo zoo = new Zoo();
        animalList.forEach(zoo::addAnimal);
        System.out.println("Predators from the zoo:");
        zoo.getAllAnimals().stream()
                .filter(animal -> {
                    try {
                        return !animal.getClass().getField("IS_VEGAN").getBoolean(animal);
                    } catch (IllegalAccessException | NoSuchFieldException e) {
                        throw new RuntimeException(e);
                    }
                })
                .forEach(animal -> System.out.println("Animal with id=" + animal.getSerialNumber() + " has name " +
                        animal.getName() + " say: \"" + animal.saySomething() + "\""));
        zoo.getAllAnimals().stream()
                .filter(animal -> animal.getClass().isAssignableFrom(Cat.class))
                .filter(animal -> animal.getBirthday().before(
                        Date.from(LocalDate.now().minusYears(5).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                )
                .forEach(animal -> System.out.println(
                        "The cat with serial number " + animal.getSerialNumber().toString() +
                                " and name " + animal.getName() +
                                " is older then 5. His/her birthday is " + animal.getBirthday()));

    }
}
