package ru.gb.finalwork.animal.pet;

import ru.gb.finalwork.animal.Animal;

import java.time.LocalDate;

public class Cat extends Pet{

    public Cat(long id, String type, String name, LocalDate birthDate) {
        super(id, type, name, birthDate);
    }

    @Override
    public void lernNewCommand(String comand) {
        comands.add(comand);
    }
}
