package text_processing;

import java.util.*;

public class Digits_Letters_Others {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for( char symbol : text.toCharArray() ) {
            if(Character.isDigit(symbol)) {
                digits.append(symbol);
            } else if(Character.isLetter(symbol)) {
                letters.append(symbol);
            } else {
                others.append(symbol);
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);

        scanner.close();
    }
}
