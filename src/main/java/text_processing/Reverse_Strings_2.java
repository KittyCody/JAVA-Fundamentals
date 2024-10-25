package text_processing;

import java.util.Scanner;

public class Reverse_Strings_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("end")) {
            StringBuilder wordToReverse = new StringBuilder(input);
            wordToReverse.reverse();
            System.out.println(input + " = " + wordToReverse);
            input = scanner.nextLine();
        }
        scanner.close();
    }
}
