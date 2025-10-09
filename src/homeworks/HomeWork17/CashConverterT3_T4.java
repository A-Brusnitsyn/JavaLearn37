package homeworks.HomeWork17;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

public class CashConverterT3_T4 {
    public static void main(String[] args) {
        final double EXCHANGE_RATE = 0.292;
        Random random = new Random();
        double byn = Math.round(random.nextDouble(0, 999) * 100) / 100.0;

        //Задача 3:
        //Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //возвращать сумму, переведенную сразу в доллары.

        String cash = byn + " BYN";

        System.out.println("Тут в качестве функционального интерфейса используется Function");
        Function<String, Double> converter = input -> {
            String s = input.split(" ")[0];
            Double d = Double.parseDouble(s);
            return d * EXCHANGE_RATE;
        };
        System.out.printf("%s конвертируется в %.2f USD\n", cash, converter.apply(cash));

        //Задача 4:
        //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //выводить сумму, переведенную сразу в доллары.

        System.out.println("\nТут в качестве функционального интерфейса используется Consumer");
        Consumer<String> altConverter = input -> {
            String s = input.split(" ")[0];
            Double d = Double.parseDouble(s);
            double usdCash = d * EXCHANGE_RATE;
            System.out.printf("%s конвертируется в %.2f USD", input, usdCash);
        };
        altConverter.accept(cash);

    }

}
