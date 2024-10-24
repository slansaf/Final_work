import ru.gb.finalwork.animal.Animal;
import ru.gb.finalwork.animal.pet.Cat;
import ru.gb.finalwork.service.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addAnimal("Cat", "Жучка", LocalDate.of(2000, 2, 10));
        service.addAnimal("Cat", "Барсик", LocalDate.of(2010, 1, 12));
        service.addAnimal("Cat", "Рыжил", LocalDate.of(2001, 11, 1));
        service.addAnimal("Cat", "Мурзик", LocalDate.of(2011, 12, 11));

        System.out.println(service.getAnimalListInfo());
        service.sortByName();
        System.out.println(service.getAnimalListInfo());
        service.sortByBirthDate();
        System.out.println(service.getAnimalListInfo());

    }

}