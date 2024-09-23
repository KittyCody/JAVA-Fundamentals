package objects_and_classes.songs.poker;

import java.util.ArrayList;
import java.util.List;

//the logic of the game
public class PokerGame {
    private final Deck deck;
    private final List<Card> communityCards;

    public PokerGame() {
        deck = new Deck();
        communityCards = new ArrayList<>();
    }

    //simulates dealing community cards
    public void flop() {
        // 1st round, burn 1 card, then deal 3
        deck.deal(1);
        communityCards.addAll(deck.deal(3));
        // 2d round, burn 1 card, then deal 1
        deck.deal(1);
        communityCards.add(deck.deal(1).get(0));
        // 3d round burn 1 card, then deal 1
        deck.deal(1);
        communityCards.add(deck.deal(1).get(0));
    }

    public void displayCommunityCards() {
        System.out.println("Community Cards: " + communityCards);
    }

    public Deck getDeck() {
        return deck;
    }

    public void showdown(List<Card> playerHand) {
        System.out.println("Player's Hand: " + playerHand + " + Community: " + communityCards);
        String handStrength = evaluateHand(playerHand);
        System.out.println("Hand Strength: " + handStrength);
    }

    private String evaluateHand(List<Card> playerHand) {

        if (isPair(playerHand)) {
            return "Pair";
        }
        return "High Card";
    }

    private boolean isPair(List<Card> hand) {
        String rank1 = hand.get(0).toString().substring(0, hand.get(0).toString().length() - 1);
        String rank2 = hand.get(1).toString().substring(0, hand.get(1).toString().length() - 1);
        return rank1.equals(rank2);
    }
}
