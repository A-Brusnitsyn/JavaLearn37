package self_study.Lesson28.Generics.Task2;

public class Wrapper<T> {
    private final T value;

    public Wrapper(T value) {
        this.value = value;
    }

    public boolean isNull() {
        return value == null;
    }
}
