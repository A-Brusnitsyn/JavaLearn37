package self_study.Lesson14.Polymorphism.Task1.model;
//Задача 1:
//Реализуйте класс «Правильная фигура». Для него создайте классы-наследники Треугольник и Квадрат.
//Пользователь должен иметь возможность ввести длину стороны и выбрать тип фигуры. Программа должна нарисовать
// в консоли выбранную пользователем фигуру, используя символы '-', '|', '/', '\'.

import java.util.Scanner;

//Обратите внимание, символ '\' в Java необходимо экранировать: '\\'.
public class Main {
    public static void main(String[] args) {

        paintFigure();

    }
    static void paintFigure(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип фигуры(Квадрат или Треугольник): ");
        String stor=scanner.nextLine();
        if (stor.equals("Квадрат")){
            Figure square =new Square("Квадрат");
            System.out.println("Введите длину стороны квадрата: ");
            square.paint(scanner.nextInt());
        } else if (stor.equals("Треугольник")){
            Figure triangle =new Triangle("Треугольник");
            System.out.println("Введите длину стороны треугольника: ");
            triangle.paint(scanner.nextInt());
        } else {
            System.out.println("Неверная фигура!");
        }
        scanner.close();
    }
}

