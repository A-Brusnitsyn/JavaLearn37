package CodeTraining.Lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Написать программу, которая принимает строку с клавиатуры:
        //Если введенная строка равна Hi - вывести в консоль Hello;
        //Если Bye - Good bye;
        //Если How are you - How are your doing;
        //Если любая другая строка - вывести Unknown message.
        //Реализуйте решение через:
        //if-else
        //switch-case

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String text = sc.nextLine();

        switch (text) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are you doing");
                break;
            default:
                System.out.println("Unknown message");
        }

        if (text.equals("Hi")) {
            System.out.println("Hello");
        } else if (text.equals("Bye")) {
            System.out.println("Bye bye");
        } else if (text.equals("How are you")) {
            System.out.println("I'm fine and you?");
        } else {
            System.out.println("Unknown message");
        }
        sc.close();
    }
}
