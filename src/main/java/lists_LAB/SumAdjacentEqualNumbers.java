package lists_LAB;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        boolean found = true;

        while (found) {
            found = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).equals(numbers.get(i + 1))) {
                    numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                    numbers.remove(i + 1);
                    found = true;
                    break;
                }
            }
        }

        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);

        scan.close();
    }

    private static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        StringBuilder output = new StringBuilder();
        for (Double item : items) {
            output.append(new DecimalFormat("0.#").format(item)).append(delimiter);
        }
        return output.toString().trim();
    }
}

