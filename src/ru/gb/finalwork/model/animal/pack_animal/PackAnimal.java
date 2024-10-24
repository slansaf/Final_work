package ru.gb.finalwork.model.animal.pack_animal;

import ru.gb.finalwork.model.animal.Animal;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal {
    public PackAnimal(Long id, String type, String name, LocalDate birhtDate) {
        super(id, type, name, birhtDate);
    }
}
