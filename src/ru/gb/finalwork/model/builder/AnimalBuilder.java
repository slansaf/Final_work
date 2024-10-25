package ru.gb.finalwork.model.builder;

import ru.gb.finalwork.model.animal.Animal;
import ru.gb.finalwork.model.animal.pack_animal.Camel;
import ru.gb.finalwork.model.animal.pack_animal.Donkey;
import ru.gb.finalwork.model.animal.pack_animal.Horse;
import ru.gb.finalwork.model.animal.pet.Cat;
import ru.gb.finalwork.model.animal.pet.Dog;
import ru.gb.finalwork.model.animal.pet.Hamster;

import java.time.LocalDate;

public class AnimalBuilder {
    private long genIdForAnimal;
    private long totalAnimalsCount;

    public Animal createAnimal(String type, String name, LocalDate birthDate) {

        return switch (type.toLowerCase()) {
            case "cat" -> {
                ++totalAnimalsCount;
                yield new Cat(genIdForAnimal++, type, name, birthDate);
            }
            case "dog" -> {
                ++totalAnimalsCount;
                yield new Dog(genIdForAnimal++, type, name, birthDate);
            }
            case "hamster" -> {
                ++totalAnimalsCount;
                yield new Hamster(genIdForAnimal++, type, name, birthDate);
            }
            case "camel" -> {
                ++totalAnimalsCount;
                yield new Camel(genIdForAnimal++, type, name, birthDate);
            }
            case "donkey" -> {
                ++totalAnimalsCount;
                yield new Donkey(genIdForAnimal++, type, name, birthDate);
            }
            case "horse" -> {
                ++totalAnimalsCount;
                yield new Horse(genIdForAnimal++, type, name, birthDate);
            }
            default -> throw new IllegalArgumentException("Тип животного '" + type + "' не поддерживается!");
        };
    }
    public void getTotalAnimalsCount() {
        System.out.println("Общее количество животных составляет: " + totalAnimalsCount + "\n");
    }
}

