package ru.gb.finalwork.presenter;

import ru.gb.finalwork.model.service.Service;
import ru.gb.finalwork.view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view){
        this.view = view;
        service = new Service();
    }

    public void addAnimal(String type, String name, int year, int month, int day) {
        service.addAnimal(type, name, LocalDate.of(year, month, day));
        getAnimalListInfo();
    }

    public void getAnimalListInfo() {
        String answer = service.getAnimalListInfo();
        view.printAnswer(answer);
    }

    public void sortByName() {
        service.sortByName();
        getAnimalListInfo();
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
        getAnimalListInfo();
    }
}
