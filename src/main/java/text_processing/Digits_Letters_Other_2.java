package text_processing;

import java.util.*;

public class Digits_Letters_Other_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for(char character : text.toCharArray()) {
            if(Character.isDigit(character)) {
                digits.append(character);
            } else if(Character.isLetter(character)) {
                letters.append(character);
            } else {
                other.append(character);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
        scanner.close();
    }
}
