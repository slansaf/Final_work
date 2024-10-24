package ru.gb.finalwork.animal.pet;

import ru.gb.finalwork.animal.Animal;

import java.time.LocalDate;

public abstract class Pet extends Animal {
    public Pet(long id, String type, String name, LocalDate birthDate){
        super(id, type, name, birthDate);
    }

    abstract public void lernNewCommand(String comand);
}
