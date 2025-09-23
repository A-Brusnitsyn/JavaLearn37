package self_study.Lesson13.Inheritance.Task2;

//Задача 2 (*):
//Реализуйте класс Animal. Реализуйте его наследников: Dog, Cat, Cow. Каждый из наследников должен содержать свой метод:
// woof(), meow() и moo() соответственно. Остальные поля и методы суперкласса и наследников реализовать по своему
// усмотрению, если они необходимы.

//Каждый из методов должен выводить в консоль соответствующую ему строку: woof, meow или moo.
//В main() создать и наполнить в произвольном порядке объектами разных классов-наследников массив типа Animal.

//Реализовать метод, принимающий массив Animal и вызывающий метод, характерный для конкретного животного.
//Использовать при решении instanceof, getClass() или другие еще неизвестные нам механики – недопустимо.

import self_study.Lesson13.Inheritance.Task2.model.Animal;
import self_study.Lesson13.Inheritance.Task2.model.Cat;
import self_study.Lesson13.Inheritance.Task2.model.Cow;
import self_study.Lesson13.Inheritance.Task2.model.Dog;

//Дополнительное условие (необязательно): решить задачу, при условии, что woof(), meow() и moo() внутри себя выполняют
// только вызов protected-метода sound(), который определен в Animal.
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();
        cat.meow();
        dog.woof();
        cow.moo();

        Animal[] animals = new Animal[]{cat,cow,dog,cow,dog,cat};
        zoo(animals);

    }
    private static void zoo(Animal[] animals){
        for (Animal animal:animals){
            sound(animal);
        }

    }
    private static void sound(Animal animal){
        switch (animal.getClassName()){
            case Cat.CAT_CLASS_NAME -> ((Cat) animal).meow();
            case Dog.DOG_CLASS_NAME -> ((Dog) animal).woof();
            case Cow.COW_CLASS_NAME -> ((Cow) animal).moo();
            default -> System.out.println("Нет такого животного");
        }
    }
}
