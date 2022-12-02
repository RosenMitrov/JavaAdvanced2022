package JavaAdvanced.ad08Generics.exercises.P10Tuple;

public class Tuple<F, S> {
    private F itemOne;
    private S itemTwo;

    public Tuple(F itemOne, S itemTwo) {
        this.itemOne = itemOne;
        this.itemTwo = itemTwo;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s", this.itemOne.toString(), this.itemTwo.toString());
    }
}
