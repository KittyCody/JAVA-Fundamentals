package regular_expressions.exam_preparation;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(!charCounts.containsKey(ch)) {
                charCounts.put(ch, 1);
            }
            else {
                charCounts.put(ch, charCounts.get(ch) + 1);
            }

            if(charCounts.get(ch) == 1) {
                System.out.println(ch);
            }
        }

        scanner.close();
    }
}
