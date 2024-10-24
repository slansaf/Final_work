package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class AddAnimal extends Command{

    public AddAnimal(ConsoleUI consoleUI) {
        super("Добавить животное", consoleUI);
    }

    @Override
    public void execute(){
       getConsoleUI().addAnimal();
    }
}
