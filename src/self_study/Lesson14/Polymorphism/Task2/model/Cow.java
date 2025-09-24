package self_study.Lesson14.Polymorphism.Task2.model;

public class Cow extends Animal {
    public static final String COW_CLASS_NAME = "cow";

    public Cow() {
        super(COW_CLASS_NAME,"moo");
    }

    @Override
    public void sound() {
        System.out.println("moo");
    }
}
