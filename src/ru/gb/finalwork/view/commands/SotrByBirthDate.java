package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class SotrByBirthDate  extends Command{

    public SotrByBirthDate(ConsoleUI consoleUI) {
        super("Сортировка по дате рождения", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().sortBirthDate();
    }
}
