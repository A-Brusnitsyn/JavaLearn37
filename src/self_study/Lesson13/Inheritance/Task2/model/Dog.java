package self_study.Lesson13.Inheritance.Task2.model;

public class Dog extends Animal {
    public static final String DOG_CLASS_NAME = "dog";
    public Dog() {
        super(DOG_CLASS_NAME,"woof" );
    }

    public void woof() {
        sound();
    }

}
