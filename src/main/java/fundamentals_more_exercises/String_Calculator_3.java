package fundamentals_more_exercises;

import java.util.Scanner;

public class String_Calculator_3 {

    public static void main(String[] args) {
        String_Calculator_3 calculator = new String_Calculator_3();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String result = calculator.add(input);
            System.out.println(result);
        }

        scanner.close();
    }

    public String add(String number) {
        // Handle empty string
        if (number.isEmpty()) {
            return "0";
        }

        if (number.endsWith(",") || number.endsWith("\n")) {
            return "Number expected but EOF found.";
        }

        String[] numbers = number.split("[,\n]");
        double sum = 0;

        StringBuilder errorMessage = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            String num = numbers[i].trim();

            // Check for empty entries
            if (num.isEmpty()) {
                errorMessage.append("Number expected but ',' found at position ").append(i + 1).append(".\n");
                continue; // Skip empty numbers
            }

            // Parse number and handle exceptions
            try {
                double value = Double.parseDouble(num);
                if (value < 0) {
                    errorMessage.append("Negative not allowed : ").append(num).append("\n");
                } else {
                    sum += value;
                }
            } catch (NumberFormatException e) {
                errorMessage.append("Invalid number: '").append(num).append("' at position ").append(i + 1).append(".\n");
            }
        }

        // Return errors if any
        if (!errorMessage.isEmpty()) {
            return errorMessage.toString().trim();
        }

        return String.valueOf(sum);
    }
}
