package regular_expressions.exam_preparation;

import java.util.Scanner;

public class FrequencyOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] words = input.split(" ");

        scanner.close();
    }
}
