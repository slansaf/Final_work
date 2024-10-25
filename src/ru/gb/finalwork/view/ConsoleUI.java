package ru.gb.finalwork.view;

import ru.gb.finalwork.model.animal.pet.Pet;
import ru.gb.finalwork.presenter.Presenter;

import java.time.LocalDate;
import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu mainMenu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        mainMenu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Приветствую!");

        while (work) {
            System.out.println(mainMenu.menu());
            try {
                String choiceStr = scanner.nextLine();
                int choice = Integer.parseInt(choiceStr);
                if (choice > mainMenu.size()) {
                    throw new IllegalArgumentException("Выбранное значение не входит в допустимый диапазон.");
                }
                mainMenu.execute(choice);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введено неверное значение. Попробуйте снова.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void finish() {
        work = false;
    }

    public void sortBirthDate() {
        presenter.sortByBirthDate();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getAnimalList() {
        presenter.getAnimalListInfo();
    }

    public void AnimalToTrain() {
        System.out.print("Введите команду обучения: ");
        String command = scanner.nextLine().trim();
        System.out.println("Введите номер Id животного для обучения");
        int id = Integer.parseInt(scanner.nextLine());
        presenter.commandToLern(id, command);
    }

    public void ListOfCommands() {
        System.out.println("Введите номер Id животного для обучения");
        int id = Integer.parseInt(scanner.nextLine());
        presenter.listOfCommands(id);
    }

    public void getTotalAnimalsCount(){
        presenter.getTotalAnimalsCount();
    }

    public void addAnimal(){
        System.out.println("Укажите тип животного");
        String type = scanner.nextLine();
        System.out.println("Укажите имя животного");
        String name = scanner.nextLine();
        System.out.println("Укажите дату рождения животного в формате год.месяц.день ");
        String yearStr = scanner.nextLine();
        int year = Integer.parseInt(yearStr);
        String monthStr = scanner.nextLine();
        int month = Integer.parseInt(monthStr);
        String dayStr = scanner.nextLine();
        int day= Integer.parseInt(dayStr);
        // проверить на валидность
        presenter.addAnimal(type, name, year, month, day);
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }

}
