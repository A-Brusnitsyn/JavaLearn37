package homeworks.HomeWork8.Task2;

import java.util.Random;

public class Circle extends Figure {
    private int r;
    private double pi = Math.PI;
    private double sqr;
    private double prmtr;

    public Circle(int r) {
        this.r = r;
    }

    public Circle() {
        Random random = new Random();
        this.r = random.nextInt(5, 10);
    }

    @Override
    void getSquare() {
        sqr = pi * (r * r);
        System.out.printf("\nПлощадь круга равна: %.2f ",sqr);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "prmtr=" + prmtr +
                '}';
    }

    @Override
    double getPerimetr() {
        prmtr = 2 * pi * r;
        return prmtr;
        //System.out.printf("Периметр круга равен: %.2f ", prmtr);
    }
}
