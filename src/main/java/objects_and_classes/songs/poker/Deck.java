package objects_and_classes.songs.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Manages a collection of playing cards (the deck)

public class Deck {
    private final List<Card> cards;

    //constructing a new deck of cards using the object Card
    public Deck() {
        cards = new ArrayList<>();
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"♠", "♣", "♡", "♢"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }

        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    //deal the specific nu,ber of cards manipulated; creates a new list for the dealt cards and remove them after.
    public List<Card> deal(int count) {
        List<Card> hand = new ArrayList<>(cards.subList(0, count));
        cards.subList(0, count).clear();
        return hand;
    }

    public List<Card> getRemainingCards() {
        return cards;
    }
}
