package ru.gb.finalwork.human_friend;

import ru.gb.finalwork.animal.Animal;

import java.time.LocalDate;

public interface HumanFriendable<T> {
    LocalDate getBirhtDate();
    String getName();

}
