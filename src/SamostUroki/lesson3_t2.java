package SamostUroki;

import javax.swing.text.Highlighter;
import java.util.Scanner;

public class lesson3_t2 {
    public static void main(String[] args) {
        /*Написать программу, которая принимает строку с клавиатуры:

        Если введенная строка равна Hi - вывести в консоль Hello;
        Если Bye - Good bye;
        Если How are you - How are your doing;
        Если любая другая строка - вывести Unknown message.
        Реализуйте решение через:

        if-else
        switch-case*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите приветствие: ");
        String talk = scanner.next();
        if (talk.equals("Hi")) {
            System.out.println("Hello");
        } else if (talk.equals("Bye")) {
            System.out.println("Good bye");
        } else if (talk.equals("How are you")) {
            System.out.println("How are your doing");
        } else {
            System.out.println("Unknown message");
        }
scanner.close();
        switch (talk){
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("I'm OK!");
                break;
            default:
                System.out.println("Unknown message");
            break;

        }
    }
}
