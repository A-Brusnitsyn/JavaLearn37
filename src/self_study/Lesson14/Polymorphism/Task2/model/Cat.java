package self_study.Lesson14.Polymorphism.Task2.model;

public class Cat extends Animal {
    public static final String CAT_CLASS_NAME = "cat";

    public Cat() {
        super(CAT_CLASS_NAME,"meow");
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }
}
