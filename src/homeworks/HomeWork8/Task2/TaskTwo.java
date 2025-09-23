package homeworks.HomeWork8.Task2;

/*Задача 2:
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
периметра всех фигур в массиве.*/

import java.util.Random;

public class TaskTwo {
    public static void main(String[] args) {

        Random random = new Random();
        Figure[] figures = new Figure[5];

        for (int i = 0; i < figures.length; i++) {
            int rand = random.nextInt(3); // 0,1,2
            switch (rand) {
                case 0 -> figures[i] = new Circle();
                case 1 -> figures[i] = new Triangle();
                case 2 -> figures[i] = new Rectangle();
            }

        }
        double sumP = 0;
        for (Figure f : figures) {
            sumP += f.getPerimetr();
            System.out.println(f.toString());

        }
        System.out.printf("\nСумма периметров фигур в массиве равна: %.2f", sumP);
    }
}
