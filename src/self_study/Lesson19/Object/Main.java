package self_study.Lesson19.Object;

import java.util.Scanner;

//Задача:
//Реализуйте класс Машина. Поля допустимо выбрать на свое усмотрение, но необходимо, чтобы по ним можно было однозначно
//идентифицировать каждую машину. Скажем, в рамках базы ГАИ.
//Создайте массив машин. Реализуйте максимально эффективную проверку на вхождение машины в ваш массив. Данные для проверки
//необходимо запрашивать с клавиатуры.
//Если машина найдена — выведите ее строковое представление в консоль.
//Опциональное усложнение: номер машины может быть не уникальным.
public class Main {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("S156FDF89","vin001", "Toyota", "Camry"),
                new Car("S566Dff", "vin002", "Lada", "2110"),
                new Car("S566Dff", "vin003", "Lada", "Granta"),
                new Car("СП346ПРР344", "vin004", "Omoda", "C5"),
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите VIN номер для поиска:");
        String searchVin=sc.nextLine();

        Car searchCar = new Car("",searchVin,"","");

        boolean found=false;

        for (Car car:cars){
            if (car.equals(searchCar)){
                System.out.println("Машина найдена! " +car.toString());
                found=true;
                break;
            }
        }
        if (!found){
            System.out.println("Машина с VIN " + searchVin + " не найдена!");
        }

    }
}
