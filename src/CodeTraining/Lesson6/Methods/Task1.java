package CodeTraining.Lesson6.Methods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String text = sc.nextLine();
        saySth(text);
    }

    static void saySth(String text) {
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
    }
}
