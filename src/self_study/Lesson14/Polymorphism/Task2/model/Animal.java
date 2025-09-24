package self_study.Lesson14.Polymorphism.Task2.model;


public class Animal {
    private final String className;
    private final String sound;

    public Animal(String className, String sound) {
        this.className = className;
        this.sound = sound;
    }

    public String getClassName() {
        return className;
    }

    public void sound() {
        System.out.println(sound);

    }
}
