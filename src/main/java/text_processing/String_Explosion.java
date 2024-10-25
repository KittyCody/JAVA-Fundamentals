package text_processing;

import java.util.Scanner;

public class String_Explosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);

        int totalStrength = 0;

        for (int position = 0; position < textBuilder.length(); position++) {
            char currentSymbol = textBuilder.charAt(position);

            if (currentSymbol == '>') {
                if (position + 1 < textBuilder.length()) {

                    int explosionStrength = Integer.parseInt(textBuilder.charAt(position + 1) + "");
                    totalStrength += explosionStrength;
                }
            } else if (totalStrength > 0) {
                textBuilder.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }

        System.out.println(textBuilder);
        scanner.close();
    }
}
