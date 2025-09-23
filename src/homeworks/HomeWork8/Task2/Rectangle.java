package homeworks.HomeWork8.Task2;

import java.util.Random;

public class Rectangle extends Figure {
    private int a; //первая сторона
    private int b; //вторая сторона
    private double sqr;
    private double prmtr;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
        Random random = new Random();
        this.a = random.nextInt(1, 10);
        this.b = random.nextInt(1, 10);
    }

    @Override
    void getSquare() {
        sqr = a * b;
        System.out.println("\nПлощадь прямоугольника равна: " + sqr);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "prmtr=" + prmtr +
                '}';
    }

    @Override
    double getPerimetr() {
        prmtr = 2 * (a + b);
        //System.out.println("Периметр прямоугольника равен: " + prmtr);
        return prmtr;
    }
}
