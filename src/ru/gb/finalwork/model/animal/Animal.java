package ru.gb.finalwork.model.animal;

import ru.gb.finalwork.model.human_friend.HumanFriendable;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Animal implements HumanFriendable<Animal> {
    protected long id;
    protected String name;
    protected String type;
    protected LocalDate birhtDate;
    protected List<String> comands = new ArrayList<>();;

    public Animal(long id, String type, String name, LocalDate birhtDate) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.birhtDate = birhtDate;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public List<String> getCommands() {
        return comands;
    }

    public LocalDate getBirhtDate() {
        return birhtDate;
    }

    public int gerAge(){
        return getPeriod(birhtDate,LocalDate.now());
    }

    private int getPeriod(LocalDate birhtDate, LocalDate nawDate){
        Period diff = Period.between(birhtDate, nawDate);
        return diff.getYears();
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", birhtDate=" + birhtDate +
                ", comands=" + comands +
                '}';
    }

}
