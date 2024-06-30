package FundamentalsExercises;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double coinsSum = 0;

        while (true) {
            String userInput = scan.next();
            if (userInput.equals("Start")) {
                break;
            }

            double coin;
            try {
                coin = Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.printf("Cannot accept %s%n", userInput);
                continue;
            }

            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1.0 || coin == 2.0) {
                coinsSum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
        }

        double nutsPrice = 2.0;
        double waterPrice = 0.7;
        double crispsPrice = 1.5;
        double sodaPrice = 0.8;
        double cokePrice = 1.0;

        while (true) {
            String product = scan.next();
            if (product.equals("End")) {
                break;
            }

            switch (product) {
                case "Nuts":
                    if (coinsSum >= nutsPrice) {
                        coinsSum -= nutsPrice;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (coinsSum >= waterPrice) {
                        coinsSum -= waterPrice;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (coinsSum >= crispsPrice) {
                        coinsSum -= crispsPrice;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (coinsSum >= sodaPrice) {
                        coinsSum -= sodaPrice;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (coinsSum >= cokePrice) {
                        coinsSum -= cokePrice;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
        }

        System.out.printf("Change: %.2f%n", coinsSum);

        scan.close();
    }
}



