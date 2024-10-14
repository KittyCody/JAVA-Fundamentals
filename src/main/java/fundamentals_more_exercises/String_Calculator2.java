package fundamentals_more_exercises;

import java.util.*;

public class String_Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = sanitizeInputt(input);
        String result = addSum(input);

        System.out.println(result);

        scanner.close();
    }

    private static String addSum( String input) {
        String[] numbers = input.split(",");
        double sum = 0;

        for(String number : numbers) {
            if(number.isEmpty()){
                number = "0";
            }

            if (number.startsWith(",") && number.startsWith("\n") || number.startsWith(",") && number.endsWith("\n")) {
                return "Number expected but EOF found.";
            }

            double numToAdd = Double.parseDouble(number);

            if(numToAdd < 0){
                return "Negative numbers not allowed";
            }

            sum += numToAdd;
        }
        return String.format("%.2f", sum);
    }

    private static String sanitizeInputt(String input) {
        input = input.replaceAll("[^\\d.,]", "");
        input = input.replaceAll("\\s+", "");
        return input;
    }
}
