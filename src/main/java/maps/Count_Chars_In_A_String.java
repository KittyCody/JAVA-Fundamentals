package maps;

import java.util.*;

public class Count_Chars_In_A_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.replaceAll("\\s+", "");

        Map<Character,Integer> charOccurrences = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if(!charOccurrences.containsKey(currentChar)) {
                charOccurrences.put(currentChar, 1);
            } else {
                charOccurrences.put(currentChar, charOccurrences.get(currentChar) + 1);
            }
        }
        charOccurrences.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        scanner.close();
    }
}
