package Exercises;
import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int chickenMenus = Integer.parseInt(scan.nextLine());
    int fishMenus = Integer.parseInt(scan.next());
    int vegetarianMenus = Integer.parseInt(scan.next());

    double chickenPrice = chickenMenus * 10.35;
    double fishPrice = fishMenus * 12.40;
    double veggiePrice = vegetarianMenus * 8.15;
    double totalFoodCost = chickenPrice + fishPrice + veggiePrice;
    double dessertPrice = totalFoodCost * 0.2;
    double deliveryTax = 2.50;
    totalFoodCost += dessertPrice;
    totalFoodCost += deliveryTax;

    System.out.println(totalFoodCost);

    scan.close();


    }
}
