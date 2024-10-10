package fundamentals_more_exercises;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] firstWordLetters = input.split(" ");
        String[] secondWordLetters = input2.split(" ");

        boolean isPermutation = false;
        int lettersCount = 0;
        for (String firstWordLetter : firstWordLetters) {
            char letter1 = firstWordLetter.charAt(0);
            for (int j = 0; j < secondWordLetters.length; j++) {
                char letter2 = secondWordLetters[j].charAt(0);
                if (secondWordLetters[j].equals(firstWordLetter)) {
                    lettersCount++;
                }
            }

        }

        if(lettersCount == secondWordLetters.length) {
            isPermutation = true;
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        scanner.close();
    }
}
