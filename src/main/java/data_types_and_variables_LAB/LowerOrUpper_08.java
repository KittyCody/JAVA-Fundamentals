package data_types_and_variables_LAB;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letter = scan.nextLine();

        if(letter.equals(letter.toLowerCase())) {
            System.out.println("lower-case");
        } else if(letter.equals(letter.toUpperCase())) {
            System.out.println("upper-case");
        }

        scan.close();
    }
}
