package ru.gb.finalwork.model.human_friend;

import ru.gb.finalwork.model.animal.Animal;

import java.util.*;

public class HumanFriend<E extends HumanFriendable<E>>  implements Iterable<E>{
    private List<E> animalList;

    public HumanFriend(){
        animalList = new ArrayList<>();
    }
    public void addAnimal(E animal) {
        animalList.add(animal);
    }

    public void sortByName(){
        animalList.sort((e1,e2) -> e1.getName().compareTo(e2.getName()));
    }

    public void sortByBirhtDate(){
        animalList.sort(Comparator.comparing(HumanFriendable::getBirhtDate));
    }

    @Override
    public Iterator<E> iterator() {
        return new AnimalIterator<>(animalList);
    }

}
