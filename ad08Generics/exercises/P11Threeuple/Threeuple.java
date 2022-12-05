package JavaAdvanced.ad08Generics.exercises.P11Threeuple;

public class Threeuple<F, S, T> {
    private F firstItem;
    private S secondItem;
    private T thirdItem;

    public Threeuple(F firstItem, S secondItem, T thirdItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }

    public boolean isDrunkOrNot(T value) {
        return value.equals("drunk");
    }

    public void setThirdItem(T thirdItem) {
        if (isDrunkOrNot(thirdItem)){
            this.thirdItem = (T)"true";
        } else {
            this.thirdItem = (T)"false";
        }
    }

    @Override
    public String toString() {
        return String.format("%s -> %s -> %s", this.firstItem, this.secondItem, this.thirdItem);
    }
}
