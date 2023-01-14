package ObjectOrientedProgramming.L01Abstraction.exercises.P03CardsWithPower;

public enum SuitPower {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    int suitPower;

    SuitPower(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return this.suitPower;
    }
}
