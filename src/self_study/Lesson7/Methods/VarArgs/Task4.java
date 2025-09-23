package self_study.Lesson7.Methods.VarArgs;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Задача 4:
        //Вычислите результат выражения, используя рекурсивный алгоритм. n — число, введенное с клавиатуры.
        //Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.
        //Выражение: √(1 + √(2 + ... + √n)))
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Число должно быть как минимум - 1");
        }
        System.out.println(recFunc(n));
    }
    static double recFunc(int i){
        return recFunc(1,i);
    }
    static double recFunc(int num, int maxNum){
        if (num==maxNum){
            return Math.sqrt(num);
        }
        return Math.sqrt(num+recFunc(num+1,maxNum));

    }
}
