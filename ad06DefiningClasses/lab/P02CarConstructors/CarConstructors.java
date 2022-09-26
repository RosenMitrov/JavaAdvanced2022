package JavaAdvanced.ad06DefiningClasses.lab.P02CarConstructors;

public class CarConstructors {
    private String brand;
    private String model;
    private int horsepower;

    public CarConstructors(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = -1;
    }

    public CarConstructors(String brand, String model, int horsepower) {
        this(brand);
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public String carInfo() {

        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsepower);
    }
}
