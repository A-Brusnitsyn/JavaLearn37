package CodeTraining.Lesson7.Methods.VarArgs;

public class Task5 {
    public static void main(String[] args) {
        int[] primes = new int[10];
        fillPrimes(primes, 0, 2);
        int sum = calculateSum(primes, 0, 0);
        System.out.println(sum);
    }

    // Рекурсивный метод для заполнения массива простыми числами
    public static void fillPrimes(int[] primes, int index, int candidate) {
        if (index >= primes.length) {
            return;
        }
        if (isPrime(candidate, 2)) {
            primes[index] = candidate;
            fillPrimes(primes, index + 1, candidate + 1);
        } else {
            fillPrimes(primes, index, candidate + 1);
        }
    }

    // Рекурсивный метод для проверки простоты числа
    public static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor + 1);
    }

    // Рекурсивный метод для вычисления суммы элементов массива
    public static int calculateSum(int[] array, int index, int currentSum) {
        if (index >= array.length) {
            return currentSum;
        }
        return calculateSum(array, index + 1, currentSum + array[index]);
    }
}
