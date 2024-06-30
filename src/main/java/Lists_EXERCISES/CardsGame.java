package Lists_EXERCISES;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = calculateWinner(firstDeck, secondDeck);
        System.out.println(sum);
    }

    private static int calculateWinner(List<Integer> firstDeck, List<Integer> secondDeck) {
        int sum = 0;

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            int firstDeckCard = firstDeck.get(0);
            int secondDeckCard = secondDeck.get(0);

            if (firstDeckCard > secondDeckCard) {
                firstDeck.remove(0);
                secondDeck.remove(0);
                firstDeck.add(firstDeckCard);
                firstDeck.add(secondDeckCard);
            } else if (secondDeckCard > firstDeckCard) {
                firstDeck.remove(0);
                secondDeck.remove(0);
                secondDeck.add(secondDeckCard);
                secondDeck.add(firstDeckCard);
            } else {
                firstDeck.remove(0);
                secondDeck.remove(0);
            }
        }

        if (!firstDeck.isEmpty()) {
            for (int card : firstDeck) {
                sum += card;

            }
        } else {
            for (int card : secondDeck) {
                sum += card;
            }
        }
        if(!firstDeck.isEmpty()){
        System.out.print("First player wins! Sum: " );}
        else{
        System.out.print("Second player wins! Sum: " );}

        return sum;
    }
}
