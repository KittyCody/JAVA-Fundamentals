package Exercises;
import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numPenPackages = Integer.parseInt(scan.nextLine());
        int numMarkersPackages = Integer.parseInt(scan.nextLine());
        int litresDetergent = Integer.parseInt((scan.nextLine()));
        int discountPercent = Integer.parseInt((scan.nextLine()));



        double packetPenCost = numPenPackages * 5.80;
        double packetMarkersCost = numMarkersPackages * 7.20;
        double detergentCost = litresDetergent * 1.20;

        double totalCost = packetPenCost + packetMarkersCost + detergentCost;
        double costWithAddedDiscount = totalCost - (totalCost * discountPercent / 100);

        System.out.println(costWithAddedDiscount);

        scan.close();


    }
}
