package ru.gb.finalwork.model.animal.pet;

import ru.gb.finalwork.model.animal.Animal;
import ru.gb.finalwork.model.human_friend.HumanFriendable;

import java.time.LocalDate;

public abstract class Pet extends Animal {
    public Pet(long id, String type, String name, LocalDate birthDate){
        super(id, type, name, birthDate);
    }

    abstract public void lernNewCommand(String comand);
}
