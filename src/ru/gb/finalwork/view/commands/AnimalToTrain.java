package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class AnimalToTrain  extends Command{

    public AnimalToTrain(ConsoleUI consoleUI) {
        super("Обучить животное новой команде", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().AnimalToTrain();
    }
}