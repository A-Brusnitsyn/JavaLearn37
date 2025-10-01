package homeworks.HomeWork15.Task2;

//Задача 2:
//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//объекта этого класса в main методе другого класса.

public class Main {
    public static void main(String[] args) {
        AnimalCollection animalCollection = new AnimalCollection();

        animalCollection.infoAnimals();
        animalCollection.removeAnimal();

        animalCollection.addAnimal("Лев");
        animalCollection.addAnimal("Слон");
        animalCollection.addAnimal("Жираф");
        animalCollection.addAnimal("Крыса");

        animalCollection.infoAnimals();
        animalCollection.getSize();
        animalCollection.removeAnimal();
        animalCollection.getSize();

    }
}
