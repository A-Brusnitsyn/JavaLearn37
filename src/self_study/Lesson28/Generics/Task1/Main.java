package self_study.Lesson28.Generics.Task1;

//Задача 1:
//Создать обобщенный тип, принимающий в себя любого из наследников Number. Создать метод, возводящий значение
//параметризованного типа в степень, переданную параметром в метод.

public class Main {
    public static void main(String[] args) {
        NumberPow<Integer> num = new NumberPow<>(5);
        System.out.println(num.power(2));
        NumberPow<Double> numD = new NumberPow<>(2.4);
        System.out.println(numD.power(3));
    }
}

class NumberPow<T extends Number> {
    private final T value;

    public NumberPow(T value) {
        this.value = value;
    }

    public double power(double ex) {
        return Math.pow(value.doubleValue(), ex);
    }
}
