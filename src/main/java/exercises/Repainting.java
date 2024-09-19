package exercises;
import java.util.Scanner;

public class Repainting {


    public static void main(String[] input) {
        Scanner scan = new Scanner(System.in);
        int nylonQuantity = Integer.parseInt(scan.nextLine());
        int paintQuantity = Integer.parseInt(scan.nextLine());
        int thinnerQuantity = Integer.parseInt(scan.nextLine());
        int hoursNeeded = Integer.parseInt(scan.nextLine());

        double nylonPrice = (nylonQuantity + 2) * 1.5;
        double paintPrice = (paintQuantity + paintQuantity * 0.1) * 14.5;
        double thinnerCost = thinnerQuantity * 5.0;
        double bagCost = 0.4;
        double totalCostSupplies = nylonPrice + paintPrice + thinnerCost + bagCost;
        double workersCost = totalCostSupplies * 0.3 * hoursNeeded;
        System.out.println(totalCostSupplies + workersCost);

        scan.close();
    }
}




