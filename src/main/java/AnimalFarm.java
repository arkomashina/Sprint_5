import java.util.*;

public class AnimalFarm {
    private List<String> farmAnimals;


    public AnimalFarm (List<String> farmAnimals) {
        this.farmAnimals = farmAnimals;
    }

    public Map<Animal, Integer> countedAnimals (List<String> farmAnimals) {
        Map<Animal, Integer> animals = new HashMap<>();

        for (String animal : farmAnimals) {
            String[] splits = animal.split(" ");

            if (splits.length != 2) {
                System.out.println("Please correct string [" + animal + "]. Incorrect input data.");
                continue;
            }

            Animal element;
            try {
                element = Animal.valueOf(splits[0].toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Please correct string [" + animal + "]. Incorrect input data.");
                continue;
            }

            if (animals.containsKey(element)){
                int currentCount = animals.get(element);
                animals.put(element, currentCount + 1);
            } else {
                animals.put(element, 1);
            }

        }
        return animals;
    }

    public Set<String> uniqueNames(List<String> farmAnimals) {
        HashSet<String> names = new HashSet<>();

        for (String animal : farmAnimals) {
            String[] splits = animal.split(" ");
            if (splits.length != 2) {
                System.out.println("Please correct string [" + animal + "]. Incorrect input data.");
                continue;
            }

            String name = splits[1];
            names.add(name);
        }

        return names;
    }
    HashMap<Animal, String> animals = new HashMap<>();
    public void addAnimal(Animal animal, String name){
        farmAnimals.add(animal.name() + " " + name);
    }
    public void addAnimal(Animal animal){

        farmAnimals.add(animal.name() + " " + "N");
    }

    public void addAnimal(String name){
        farmAnimals.add(Animal.NOT_DEFINED + " " + name);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String farmAnimal : farmAnimals) {
            String printFarmAnimal = farmAnimal.replace(" ", ":");
            stringBuilder.append(printFarmAnimal).append("\n");
        }

        return stringBuilder.toString();
    }



}
