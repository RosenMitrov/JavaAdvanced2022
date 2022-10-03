package JavaAdvanced.ad06DefiningClasses.exercises.P04RawData;

public class Tire {
    private double pressureTire;
    private int age;


    public Tire(double pressureTire, int age) {
        this.pressureTire = pressureTire;
        this.age = age;
    }

    public double getPressureTire() {
        return pressureTire;
    }
}
