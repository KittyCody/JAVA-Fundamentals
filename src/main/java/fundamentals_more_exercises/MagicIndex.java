package fundamentals_more_exercises;

import java.util.Scanner;

public class MagicIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            try {
                int value = Integer.parseInt(input[i]);
                if (value == i) {
                    System.out.println(i);
                }
            } catch (NumberFormatException _) {
            }
        }

        scanner.close();
    }
}
