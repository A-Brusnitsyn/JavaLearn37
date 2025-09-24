package self_study.Lesson14.Polymorphism.Task2;

import self_study.Lesson14.Polymorphism.Task2.model.Animal;
import self_study.Lesson14.Polymorphism.Task2.model.Cat;
import self_study.Lesson14.Polymorphism.Task2.model.Cow;
import self_study.Lesson14.Polymorphism.Task2.model.Dog;

//Задача 2:
//Используя новые знания, упростите реализацию задачи 2 из предыдущего урока. Допустимо использовать метод sound(),
// вместо woof(), meow() и moo(). Метод sound() допустимо сделать публичным.
//Использовать отдельное поле для хранения выводимой строки — недопустимо:)
public class Main {
    public static void main(String[] args) {
        // Создаем массив животных
        Animal[] animals = {new Cat(),new Dog(), new Cow()};

        // Вызываем метод sound для всех объектов
        System.out.println("Звуки животных:");
        for (Animal animal: animals) {
            animal.sound();
        }
    }
}
