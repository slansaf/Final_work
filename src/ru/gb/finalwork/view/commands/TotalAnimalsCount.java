package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class TotalAnimalsCount extends Command{

    public TotalAnimalsCount(ConsoleUI consoleUI) {
        super("Общее количество созданных животных", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().getTotalAnimalsCount();
    }
}
