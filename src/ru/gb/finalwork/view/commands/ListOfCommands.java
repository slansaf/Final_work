package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class ListOfCommands extends Command{

    public ListOfCommands(ConsoleUI consoleUI) {
        super("Вывести список команд питомца", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().ListOfCommands();
    }
}