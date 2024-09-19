package methods_EXERCISES;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        printMiddleCharacter(input);

        scan.close();
    }

    private static void printMiddleCharacter(String input) {
        int length = input.length();

        if (length == 0) {
            System.out.println("Empty string has no middle character.");
            return;
        }

        int midIndex = length / 2;

        if (length % 2 == 1) {
            char middleChar = input.charAt(midIndex);
            System.out.println(middleChar);
        } else {
            char middleChar1 = input.charAt(midIndex - 1);
            char middleChar2 = input.charAt(midIndex);
            System.out.println(middleChar1 + "" + middleChar2);
        }
    }
}

