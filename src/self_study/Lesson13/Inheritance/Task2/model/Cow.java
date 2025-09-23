package self_study.Lesson13.Inheritance.Task2.model;

public class Cow extends Animal {
    public static final String COW_CLASS_NAME = "cow";

    public Cow() {
        super(COW_CLASS_NAME,"moo");
    }

    public void moo() {
        sound();
    }

}
