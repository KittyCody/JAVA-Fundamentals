package data_types_and_variables_LAB;

import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            double pounds = Double.parseDouble(scan.nextLine());
            double intoDollars = pounds * 1.36;
            String formattedIntoDollars = String.format("%.3f", intoDollars);

            System.out.println(formattedIntoDollars);

        scan.close();
    }
}
