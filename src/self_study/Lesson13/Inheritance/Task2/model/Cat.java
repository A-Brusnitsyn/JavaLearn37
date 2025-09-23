package self_study.Lesson13.Inheritance.Task2.model;

public class Cat extends Animal {
    public static final String CAT_CLASS_NAME = "cat";

    public Cat() {
        super(CAT_CLASS_NAME,"meow");
    }

    public void meow() {
        sound();
    }

}
