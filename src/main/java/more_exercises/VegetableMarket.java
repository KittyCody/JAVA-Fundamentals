package more_exercises;
import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double priceVegetablesPerKg = Double.parseDouble(scan.nextLine());
        double priceFruitsPerKg = Double.parseDouble((scan.nextLine()));
        int totalVegetables = Integer.parseInt(scan.nextLine());
        int totalFruits = Integer.parseInt(scan.nextLine());

        double priceTotalVegetables = (double) totalVegetables * priceVegetablesPerKg;
        double priceTotalFruits = (double) totalFruits * priceFruitsPerKg;

        double total = priceTotalFruits + priceTotalVegetables;

        double totalInEuro = total / 1.94;
        String formatedSum = String.format("%.2f" , totalInEuro);

        System.out.println(formatedSum);

        scan.close();
    }
}
