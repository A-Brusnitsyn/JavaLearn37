package self_study.Lesson13.Inheritance.Task1;

public class Dog extends Animal {

    public Dog(String color) {
        this();
        System.out.printf("I'm a %s dog!", color);
    }

    private Dog() {
        System.out.println("I'm a dog!");
    }
}
