package self_study.Lesson18.instanceof_getclass.task2instanceof;

import self_study.Lesson18.instanceof_getclass.task2instanceof.model.Animal;
import self_study.Lesson18.instanceof_getclass.task2instanceof.model.Cat;
import self_study.Lesson18.instanceof_getclass.task2instanceof.model.Cow;
import self_study.Lesson18.instanceof_getclass.task2instanceof.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {
//        Если версия Java < 16, код будет немного отличаться. Примерно так:
//        if (animal instanceof Cat) {
//            ((Cat) animal).meow();
//        } ...
        if (animal instanceof Cat cat) {
            cat.meow();
        } else if (animal instanceof Dog dog) {
            dog.woof();
        } else if (animal instanceof Cow cow) {
            cow.moo();
        } else {
            System.out.println("Unknown animal!");
        }
    }

}
