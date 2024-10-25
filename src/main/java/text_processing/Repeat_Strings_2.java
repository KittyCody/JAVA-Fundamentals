package text_processing;

import java.util.Scanner;

public class Repeat_Strings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for(String combination : input) {
            int numToPrint = combination.length();
            result.append(combination.repeat(numToPrint));
        }

        System.out.println(result);
        scanner.close();
    }
}
