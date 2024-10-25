import ru.gb.finalwork.model.animal.Animal;
import ru.gb.finalwork.model.animal.pet.Cat;
import ru.gb.finalwork.model.animal.pet.Pet;
import ru.gb.finalwork.model.human_friend.HumanFriend;
import ru.gb.finalwork.model.service.Service;
import ru.gb.finalwork.view.ConsoleUI;
import ru.gb.finalwork.view.View;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
//
//        Service service = new Service();
//        Scanner scanner = new Scanner(System.in);
//
//        service.addAnimal("cat", "murz", LocalDate.of(2003,11,4));
//        service.addAnimal("cat", "bars", LocalDate.of(2013,8,5));
//        service.addAnimal("cat", "dim", LocalDate.of(2002,9,6));
//        service.addAnimal("cat", "pig", LocalDate.of(2001,10,7));
//        service.addAnimal("cat", "kiss", LocalDate.of(2013,12,8));
//
//        System.out.println(service.getAnimalListInfo());
//
//        System.out.print("Enter command to teach: ");
//        String command = scanner.nextLine().trim();
//        System.out.print("Select animal to teach: ");
//        Pet selectedAnimal = (Pet) service.selectAnimalToTrain();
//        selectedAnimal.lernNewCommand(command);
//
//        System.out.println(service.getAnimalListInfo());
    }

}