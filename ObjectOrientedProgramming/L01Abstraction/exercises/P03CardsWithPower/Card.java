package ObjectOrientedProgramming.L01Abstraction.exercises.P03CardsWithPower;

public class Card {
    private RankPower rankPower;
    private SuitPower suitPower;

    public Card(RankPower rankPower, SuitPower suitPower) {
        this.rankPower = rankPower;
        this.suitPower = suitPower;
    }

    public int calculateCardPower() {
        return this.rankPower.getRankPower() + this.suitPower.getSuitPower();
    }

    public void cardInfo() {
        System.out.printf("Card name: %s of %s; Card power: %d", rankPower.name(), suitPower.name(), calculateCardPower());
    }
}
