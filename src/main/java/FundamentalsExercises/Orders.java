package FundamentalsExercises;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ordersNum = Integer.parseInt(scan.nextLine());
        double total = 0;

        for (int order = 1; order <= ordersNum; order++) {
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());

            double sum = (days * capsulesCount) * pricePerCapsule;
            String formattedSum = String.format("%.2f", sum);

            total += sum;
            System.out.printf("The price for the coffee is: $%s%n", formattedSum);
        }

        System.out.printf("Total: $%.2f%n", total);

        scan.close();
    }
}


