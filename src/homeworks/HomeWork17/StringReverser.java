package homeworks.HomeWork17;

import java.util.Scanner;
import java.util.function.Supplier;

public class StringReverser {
    public static void main(String[] args) {
        //Задача 5:
        //Используя Supplier написать метод, который будет возвращать введенную с консоли
        //строку задом наперед.
        Supplier<String> revString = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку");
            StringBuilder sb = new StringBuilder(sc.nextLine());
            sc.close();
            sb.reverse();
            return sb.toString();
        };

        System.out.println(revString.get());
    }
}
