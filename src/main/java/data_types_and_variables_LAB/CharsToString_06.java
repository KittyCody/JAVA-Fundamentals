package data_types_and_variables_LAB;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String char1 = scan.nextLine();
        String char2 = scan.nextLine();
        String char3 = scan.nextLine();

        String result = char1 + char2 + char3;
        System.out.println(result);

        scan.close();
    }
}
