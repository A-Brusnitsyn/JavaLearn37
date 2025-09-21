package lesson11;

public class StringExamplePool {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello" + " world");

        //StringBuilder or StringBuffer
        StringBuilder line = new StringBuilder("Hello world!"); //ВАЖНО: Это не String объект!!!!
        line.append("!!!!");
        line.insert(5,"TEST");
        line.delete(2,5);
        line.repeat('*',5);
        line.reverse();
        System.out.println(line);

        System.out.println(new StringBuilder("Hello") == line ); //Для сравнения нужно привести к одному типу(или String или SB)
    }
}
