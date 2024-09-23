package objects_and_classes.songs.poker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PokerGame game = new PokerGame();

        List<Card> player1Hand = game.getDeck().deal(2);
        List<Card> player2Hand = game.getDeck().deal(2);

        System.out.println("Player 1's Hand: " + player1Hand);
        System.out.println("Player 2's Hand: " + player2Hand);

        game.flop();
        game.displayCommunityCards();

        game.showdown(player1Hand);
        game.showdown(player2Hand);
    }
}
