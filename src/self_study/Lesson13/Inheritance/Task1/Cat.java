package self_study.Lesson13.Inheritance.Task1;

public class Cat extends Animal {
    private Cat() {
        say();
    }

    public Cat(String color) {
        this();

        System.out.printf("I’m a %s cat\n", color);
    }

    void say() {
        System.out.println("I'm a cat!");
    }
}
