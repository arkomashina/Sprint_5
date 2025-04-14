import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> farmAnimals = Arrays.asList(
                "DOG Жучка",
                "CAT Мурка",
                "COW Бурёнка",
                "DOG Жучка",           // повтор имени
                "HORSE Буцефал",
                "DOG",                 // ошибка: нет имени
                "CAT Том",
                "КошкаМурка",          // ошибка: нет пробела
                "COW Зорька"
        );
        AnimalFarm animalFarm = new AnimalFarm(farmAnimals);
        animalFarm.countedAnimals(farmAnimals);
        animalFarm.uniqueNames(farmAnimals);
    }
}
