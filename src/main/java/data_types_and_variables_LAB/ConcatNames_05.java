package data_types_and_variables_LAB;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine();
        String name2 = scan.nextLine();
        String delimiter = scan.nextLine();

        String result = name1 + delimiter + name2;

        System.out.println(result);

        scan.close();
    }
}
