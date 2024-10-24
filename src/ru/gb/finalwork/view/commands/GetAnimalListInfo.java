package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class GetAnimalListInfo  extends Command{

    public GetAnimalListInfo(ConsoleUI consoleUI) {
        super("Получить список животных", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().getAnimalList();
    }
}