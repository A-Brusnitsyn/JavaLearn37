package self_study.Lesson13.Inheritance.Task2.model;


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

    protected void sound() {
        System.out.println(sound);

    }
}
