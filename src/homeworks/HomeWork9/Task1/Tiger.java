package homeworks.HomeWork9.Task1;

public class Tiger extends Animal{
    private String name;

    public Tiger(String name) {
        this.name=name;
    }

    public Tiger(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(String food) {
        switch (food){
            case "Meat"-> System.out.println("Вкуснотаааа!");
            case "Grass" -> System.out.println("Лучше откормить этим кролика, а я потом его съем!");
            default -> System.out.println("Такое не употребляем!");
        }
    }

    @Override
    public void voice() {
        System.out.println("Р-р-р-р-р");

    }
}
