package DataTypesAndVariablesEXERCISES;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startingYield = Integer.parseInt(scan.nextLine());
        int totalSpice = 0;
        int dayCounter = 0;

        while (startingYield >= 100) {
            dayCounter++;
            totalSpice += startingYield;
            totalSpice -= 26;
            startingYield -= 10;

            if (startingYield < 100 && totalSpice >= 26) {
                totalSpice -= 26;
            } else if (startingYield < 100 && totalSpice < 26) {
                break;
            }
        }

        System.out.println(dayCounter);
        System.out.println(totalSpice);

        scan.close();
    }
}

