package self_study.Lesson17.Enum.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String greeting = scanner.nextLine();

        scanner.close();

        GreetingType greetingType = GreetingType.findGreetingType(greeting);
        System.out.println(greetingType.getAnswer());
    }
}
