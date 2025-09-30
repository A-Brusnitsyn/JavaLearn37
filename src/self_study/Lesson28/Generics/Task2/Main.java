package self_study.Lesson28.Generics.Task2;

public class Main {
    public static void main(String[] args) {
        Wrapper<String> text = new Wrapper<>("test");
        System.out.println(text.isNull());
        Wrapper<Integer> integ = new Wrapper<>(null);
        System.out.println(integ.isNull());
    }
}
