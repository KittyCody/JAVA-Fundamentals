package fundamentals_more_exercises;

import java.util.*;

public class Serial_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Set<String> serialNumbers = new LinkedHashSet<>(Arrays.asList(input));

        for (String number : serialNumbers) {
            if (number.length() >= 9) {
                for (int j = 1; j < 9; j++) {
                    System.out.print(number.charAt(j));
                }
                System.out.print(", ");
            }
        }

        System.out.println();

        scanner.close();
    }
}
