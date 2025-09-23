package self_study.Lesson5.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Задача 2:
        //Создать массив int из 5 элементов. Заполнить его значениями, введенными с клавиатуры. Вывести на экран сумму
        //каждого значения с предыдущим. Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.

        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i =0; i< nums.length; i++){
            System.out.println("Введите значение для ячейки массива: ");
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i< nums.length;i++){
            if (i==0){
                System.out.println(nums[i]+nums[nums.length-1]);
            } else {
                System.out.println(nums[i]+nums[i-1]);
            }
        }
    }
}
