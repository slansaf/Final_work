package ru.gb.finalwork.model.service;

import ru.gb.finalwork.model.builder.AnimalBuilder;
import ru.gb.finalwork.model.human_friend.HumanFriend;
import ru.gb.finalwork.model.animal.Animal;
import ru.gb.finalwork.model.human_friend.HumanFriendable;

import java.time.LocalDate;

public class Service{
    private HumanFriend<Animal> humanFrand;
    private AnimalBuilder builder;

    public Service() {
        humanFrand = new HumanFriend<>();
        builder = new AnimalBuilder();
    }

    public void addAnimal(String type, String name, LocalDate birthDate){
        Animal animal = builder.createAnimal(type, name, birthDate);
        humanFrand.addAnimal(animal);

    }

    public String getAnimalListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список животных:\n");
        for(Object animal: humanFrand){
            stringBuilder.append(animal);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        humanFrand.sortByName();
    }

    public void sortByBirthDate(){
        humanFrand.sortByBirhtDate();
    }
}
