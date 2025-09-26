package self_study.Lesson18.instanceof_getclass.task1getclass.model;


public class Animal {

    private final String sound;

    public Animal(String sound) {

        this.sound = sound;
    }

    protected void sound() {
        System.out.println(sound);

    }
}
