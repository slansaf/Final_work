package ru.gb.finalwork.model.service;

import ru.gb.finalwork.model.animal.pet.Pet;
import ru.gb.finalwork.model.builder.AnimalBuilder;
import ru.gb.finalwork.model.human_friend.HumanFriend;
import ru.gb.finalwork.model.animal.Animal;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    public void getTotalAnimalsCount(){
        builder.getTotalAnimalsCount();

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

    public void comandToLern(int id, String command) {
        Pet selectedAnimal = spotAnAnimal(id);
        selectedAnimal.lernNewCommand(command);
    }

    public void listOfCommands(int id) {
        Pet selectedAnimal = spotAnAnimal(id);
        List<String> list = selectedAnimal.getCommands();

        if (list.isEmpty()) {
            System.out.println("У данного питомца нет команд.");
        } else {
            System.out.println("Команды питомца:");
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, list.get(i));
            }
        }
    }

    public Pet spotAnAnimal(int id){
        return (Pet) humanFrand.selectAnimal(id);
    }
}
