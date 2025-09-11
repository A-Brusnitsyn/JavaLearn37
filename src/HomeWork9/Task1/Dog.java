package HomeWork9.Task1;

public class Dog extends Animal{
    private String name;

    public Dog(String name){
        this.name=name;
    }

    public Dog(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Р-р-р-гав!");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat"){
            System.out.println(name + " любит мясо!");
        } else {
            System.out.println(food + " не любит, но непрочь погрызть!");
        }
    }
}
