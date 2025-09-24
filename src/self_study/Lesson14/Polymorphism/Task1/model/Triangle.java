package self_study.Lesson14.Polymorphism.Task1.model;

public class Triangle extends Figure{
    private String figureName;
    private int sideLenght;


    public Triangle(String figureName) {
        this.figureName = figureName;
    }

    @Override
    public void paint(int sideLenght) {

        for (int i = 0; i < sideLenght; i++) {
            // ведущие пробелы
            for (int s = 0; s < sideLenght - i - 1; s++) System.out.print(" ");

            // левая грань
            System.out.print('/');

            if (i == 0) {
                // самый верх: просто "/\"
                System.out.print('\\'); // в Java пишем "\\" в строковом литерале, но здесь это отдельный char
            } else {
                // внутренние пробелы между / и \
                for (int inner = 0; inner < 2 * i; inner++) System.out.print(" ");
                System.out.print('\\');
            }

            System.out.println();
        }

        // основание
        for (int k = 0; k < 2 * sideLenght; k++) System.out.print('-');
        System.out.println();
    }
}
