package homeworks.HomeWork18.tgTasks.Task1;

//1. Фильтрация и преобразование списка сотрудников
//Дан список сотрудников List<Employee> employees.
//Нужно получить список имен сотрудников из отдела "Security", у которых зарплата выше 100_000.
//Ожидаемый результат: List<String> — имена подходящих сотрудников.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", "Secuity", 99000);
        Employee emp2 = new Employee("Petr", "Fin", 105000);
        Employee emp3 = new Employee("Vlad", "Buh", 80000);
        Employee emp4 = new Employee("Alex", "Secuity", 150000);
        Employee emp5 = new Employee("Kira", "Fin", 919000);
        Employee emp6 = new Employee("Alina", "Secuity", 95000);
        Employee emp7 = new Employee("Masha", "Secuity", 100000);
        Employee emp8 = new Employee("Sveta", "Buh", 120000);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        list.add(emp8);
        List<Employee> sortedlist = list.stream()
                .filter(employee -> employee.getDepartment() == "Secuity")
                .filter(employee -> employee.getSalary() > 100000)
                .toList();
        for (Employee emp : sortedlist) {
            System.out.println(emp);
        }
    }
}
