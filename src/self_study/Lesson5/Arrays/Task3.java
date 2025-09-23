package self_study.Lesson5.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //Задача 3 (*):
        //Вычислить и записать в массив первые 10 простых чисел.
        //Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.
        //Вывести в консоль сумму всех элементов полученного массива.
        int[] primes = new int[10];  // массив для первых 10 простых чисел
        int count = 0;               // сколько простых чисел найдено
        int number = 2;              // начинаем проверку с 2
        int sum = 0;                 // сумма простых чисел

        while (count < 10) {
            if (isPrime(number)) {
                primes[count] = number;
                sum += number;
                count++;
            }
        }

        // Вывод массива (для наглядности)
        System.out.print("Первые 10 простых чисел: ");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();

        // Вывод суммы
        System.out.println("Сумма элементов массива = " + sum);
    }

    // метод проверки числа на простоту
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
