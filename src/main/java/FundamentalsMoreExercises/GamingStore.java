package FundamentalsMoreExercises;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headSetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double totalExpenses = 0;
        int crashedKeyboardCount = 0;

        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                totalExpenses += headSetPrice;
            }
            if (i % 3 == 0) {
                totalExpenses += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                totalExpenses += keyboardPrice;
                crashedKeyboardCount++;
                if (crashedKeyboardCount % 2 == 0) {
                    totalExpenses += displayPrice;
                }
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", totalExpenses);
        scan.close();
    }
}

