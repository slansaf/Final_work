package ru.gb.finalwork.model.animal.pet;

import java.time.LocalDate;

public class Hamster extends Pet{
    public Hamster(long id, String type, String name, LocalDate birthDate) {
        super(id,type, name, birthDate);
    }

    @Override
    public void lernNewCommand(String comand) {
        comands.add(comand);
    }
}
