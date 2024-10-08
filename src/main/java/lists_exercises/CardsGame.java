package lists_exercises;

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
            int firstDeckCard = firstDeck.getFirst();
            int secondDeckCard = secondDeck.getFirst();

            if (firstDeckCard > secondDeckCard) {
                firstDeck.removeFirst();
                secondDeck.removeFirst();
                firstDeck.add(firstDeckCard);
                firstDeck.add(secondDeckCard);
            } else if (secondDeckCard > firstDeckCard) {
                firstDeck.removeFirst();
                secondDeck.removeFirst();
                secondDeck.add(secondDeckCard);
                secondDeck.add(firstDeckCard);
            } else {
                firstDeck.removeFirst();
                secondDeck.removeFirst();
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
