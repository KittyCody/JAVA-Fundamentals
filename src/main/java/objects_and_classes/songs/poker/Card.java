package objects_and_classes.songs.poker;

public class Card {
    private final String rank;
    private final String suit;

    //initializes a card with a specific rank and suit
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    //overriding the java string method in order to return a spring representation of the card ^^
    @Override
    public String toString() {
        return rank + suit;
    }
}
