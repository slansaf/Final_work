package ru.gb.finalwork.model.human_friend;

import ru.gb.finalwork.model.animal.Animal;

import java.io.Serializable;
import java.time.LocalDate;

public interface HumanFriendable<T> extends Serializable {
    LocalDate getBirhtDate();
    String getName();

}
