package homeworks.HomeWork15.Task2;

import java.util.LinkedList;

public class AnimalCollection {
    private LinkedList<String> animals;

    public AnimalCollection() {
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println("В коллекцию добавлено животное: " + animal);
    }

    public void removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста, нечего удалять!");
            return;
        }
        String removedAnimal = animals.removeLast();
        System.out.println("Из коллекции удалено животное: " + removedAnimal);
    }

    public void getSize() {
        System.out.println("Размер коллекции: " + animals.size());
    }

    public void infoAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста");
        } else {
            System.out.println("Животные в коллекции: " + animals);
        }
    }
}
