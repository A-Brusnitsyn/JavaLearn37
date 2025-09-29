package self_study.Lesson19.Object;

public class Car {
    private String planeNumber;
    private String vin;
    private String brand;
    private String model;

    public Car(String planeNumber, String vin, String brand, String model) {
        this.planeNumber = planeNumber;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        return vin.equals(car.vin);
    }

    @Override
    public String toString() {
        return "Car{" +
                "plateNumber='" + planeNumber + '\'' +
                ", vin='" + vin + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
