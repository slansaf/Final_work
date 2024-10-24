package ru.gb.finalwork.animal.pet;

import java.time.LocalDate;

public class Humster extends Pet{
    public Humster(long id, String type, String name, LocalDate birthDate) {
        super(id,type, name, birthDate);
    }

    @Override
    public void lernNewCommand(String comand) {
        comands.add(comand);
    }
}
