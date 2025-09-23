package homeworks.HomeWork8.Task2;

import java.util.Random;

public class Triangle extends Figure {

    private int a; //длина основания
    private int b; //вторая сторона
    private int c; //третья сторона
    private double sqr;
    private double prmtr;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        Random random = new Random();
        this.a = random.nextInt(5, 10);
        this.b = random.nextInt(5, 10);
        this.c = random.nextInt(5, 10);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "prmtr=" + prmtr +
                '}';
    }

    @Override
    void getSquare() {
        double p2 = (a + b + c) / 2;
        sqr = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - 3));
        System.out.printf("\nВысчитываем площадь по формуле Герона. Площадь равна - %.2f. ", sqr);
    }

    @Override
    double getPerimetr() {
        prmtr = a + b + c;
        //System.out.println("Периметр треугольника равен " + prmtr);
        return prmtr;
    }
}
