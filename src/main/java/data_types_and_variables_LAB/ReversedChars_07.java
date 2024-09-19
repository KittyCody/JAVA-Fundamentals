package data_types_and_variables_LAB;
import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String char1 = scan.nextLine();
        String char2 = scan.nextLine();
        String char3 = scan.nextLine();

        String[] characters = {char3, char2, char1};
        StringBuilder result = new StringBuilder();
        for (String character : characters) {
            result.append(character).append(" ");
        }

        System.out.println(result);
        scan.close();
    }
}

