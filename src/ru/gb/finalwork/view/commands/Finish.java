package ru.gb.finalwork.view.commands;

import ru.gb.finalwork.view.ConsoleUI;

public class Finish  extends Command{

    public Finish(ConsoleUI consoleUI) {
        super("Завершит работу приложения", consoleUI);
    }

    @Override
    public void execute(){
        getConsoleUI().finish();
    }
}
