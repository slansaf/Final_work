package ru.gb.finalwork.animal.pet;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(long id, String type, String name, LocalDate birthDate) {
        super(id, type, name, birthDate);
    }

    @Override
    public void lernNewCommand(String comand) {
        comands.add(comand);
    }
}
