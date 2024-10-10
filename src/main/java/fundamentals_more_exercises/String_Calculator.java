package fundamentals_more_exercises;

import java.util.Scanner;

public class String_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = sanitizeInput(input);

        String result = addNumbersFromString(input);

        System.out.println(result);

        scanner.close();
    }

    private static String sanitizeInput(String input) {
        // Remove anything that's not a digit, decimal point, or comma
        input = input.replaceAll("[^\\d.,]", "");
        input = input.replaceAll("\\s+", "");
        return input;
    }

    private static String addNumbersFromString(String input) {
        String[] numbers = input.split(",");

        double sum = 0;

        for (String number : numbers) {
            number = number.trim();

            if (number.isEmpty()) {
                number = "0";
            }

            double numToAdd = Double.parseDouble(number);
            if (numToAdd < 0) {
                return "Negative not allowed";
            }

            sum += numToAdd;
        }

        return String.format("%.2f", sum);
    }
}
