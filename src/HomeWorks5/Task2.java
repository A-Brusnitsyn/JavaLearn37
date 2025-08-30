package HomeWorks5;



public class Task2 {
    public static void main(String[] args) {

        /*Задача 2:
        Создать программу для раскраски шахматной доски с помощью цикла. Создать
        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        B(Black) или W(White). При выводе результат работы программы должен быть
        следующим:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W */

        String [][] arrayDesk = new String[8][8];
        for (int i=0; i<arrayDesk.length;i++){
            for (int j = 0; j < arrayDesk[i].length; j++) {
                if ((i+j)%2==0){
                    arrayDesk[i][j]="W";
                } else
                    arrayDesk[i][j]="B";
            }
        }
        for (int i = 0; i < arrayDesk.length; i++) {
            for (int j = 0; j < arrayDesk[i].length; j++) {
                System.out.print(arrayDesk[i][j] + " ");
            }
            System.out.println();
        }
    }
}
