package ru.gb.finalwork.model.builder;

import ru.gb.finalwork.model.animal.Animal;
import ru.gb.finalwork.model.animal.pet.Cat;

import java.time.LocalDate;

public class AnimalBuilder {
    private long genIdForAnimal;

    public Animal createAnimal(String type, String name, LocalDate birthDate) {
            return new Cat(genIdForAnimal++, type, name, birthDate);
    }
}
