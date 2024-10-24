package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class SortByName  extends Command{

    public SortByName(ConsoleUI consoleUI) {
        super("Сортировка по имени", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().sortByName();
    }
}