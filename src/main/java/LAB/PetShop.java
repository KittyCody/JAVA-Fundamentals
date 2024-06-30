package LAB;
import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dogsFoodCost = 2.50;
        int catsFoodCost = 4;

        int dogsFoodPackages = Integer.parseInt(scan.nextLine());
        int catsFoodPackages = Integer.parseInt((scan.nextLine()));

        double totalSome = dogsFoodPackages * dogsFoodCost + catsFoodPackages * catsFoodCost;

        System.out.println(totalSome);
    }
}
