package Methods_LAB;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String item = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        double price = calculateTotalPrice(item, quantity);
        String formattedPrice = formatPrice(price);

        System.out.println(formattedPrice);

        scan.close();
    }

    public static double calculateTotalPrice(String item, int quantity) {

        return switch (item) {
            case "water" -> quantity * 1.00;
            case "coffee" -> quantity * 1.50;
            case "coke" -> quantity * 1.40;
            case "snacks" -> quantity * 2.00;
            default -> 0;
        };
    }

    public static String formatPrice(double price) {
        return String.format("%.2f", price);
    }
}

