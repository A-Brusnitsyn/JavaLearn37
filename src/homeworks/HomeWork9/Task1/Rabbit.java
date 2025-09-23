package homeworks.HomeWork9.Task1;

public class Rabbit extends Animal{
    private String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public Rabbit(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("что-то на кроличьем!");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat"){
            System.out.println("Кролик не хищник, " + food + " не ест!");
        } else if (food == "Grass") {
            System.out.println("Кролик любит травку!");
        } else
            System.out.println("Тщательно обнюхивает " + food);
    }
}

