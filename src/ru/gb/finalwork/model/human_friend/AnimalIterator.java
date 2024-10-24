package ru.gb.finalwork.model.human_friend;

import ru.gb.finalwork.model.animal.Animal;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator<E> implements Iterator<E> {
    private int curId;
    private List<E> animalList;

    public AnimalIterator(List<E> animalList) {
        this.animalList = animalList;
    }

    @Override
    public boolean hasNext() {
        return animalList.size() > curId;
    }

    @Override
    public E next() {
        return animalList.get(curId++);
    }
}

