package CodeTraining.Lesson7.Methods.VarArgs;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Задача 3:
        //Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a= sc.nextInt();
        System.out.println(recFact(a));
        sc.close();

    }
    static int recFact(int a){
        if (a==1){
            return 1;
        }
        return a*recFact(a-1);

    }
}
