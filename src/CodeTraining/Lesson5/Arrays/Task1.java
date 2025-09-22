package CodeTraining.Lesson5.Arrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
       //Задача 1:
       //Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.
       //Вариант 1: не используя переменную типа String;
       //Вариант 2: предварительно собрав значения массива в переменную типа String.
       //Подсказка для варианта 2: создать пустую строку можно так: String s = "";

        char[] name = new char[]{'A','л','е','к','с','а','н','д','р'};
        System.out.println(Arrays.toString(name));

        String name1 ="";
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]);
            name1+=name[i];
        }
        System.out.println(name1);
    }
}
