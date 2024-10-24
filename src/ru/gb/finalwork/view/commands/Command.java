package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public abstract class Command {
    private String discription;
    private ConsoleUI consoleUI;

    public Command(String discription, ConsoleUI consoleUI) {
        this.discription = discription;
        this.consoleUI = consoleUI;
    }

    public String getDiscription(){
        return discription;
    }

    ConsoleUI getConsoleUI(){
        return consoleUI;
    }

    public abstract void execute();
}
