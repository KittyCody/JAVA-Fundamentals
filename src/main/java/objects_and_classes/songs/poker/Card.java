package objects_and_classes.songs.poker;

public class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //trying to return a representation of the card by overriding the java method.. ^^
    @Override
    public String toString() {
        return rank + suit;
    }
}
