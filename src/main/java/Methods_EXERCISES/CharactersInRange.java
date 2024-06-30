package Methods_EXERCISES;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);

        scan.close();

        printCharactersInRange(char1, char2);
    }

    private static void printCharactersInRange(char char1, char char2) {

        char start = (char) (Math.min(char1, char2) + 1);
        char end = (char) (Math.max(char1, char2));

        if (start >= end) {
            System.out.println("No characters in between.");
            return;
        }

        for (char symbol = start; symbol < end; symbol++) {
            System.out.print(symbol + " ");
        }
        System.out.println();
    }
}




