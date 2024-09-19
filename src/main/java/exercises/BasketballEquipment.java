package exercises;
import java.util.Scanner;


public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int annualTax = Integer.parseInt(scan.nextLine());

        double sneakersCost = annualTax - annualTax * 0.4;
        double equipmentCost = sneakersCost - sneakersCost * 0.2;
        double ballCost = equipmentCost / 4;
        double accessories = ballCost / 5;

        double total = annualTax+ sneakersCost + equipmentCost + ballCost + accessories;

        System.out.println(total);

        scan.close();
    }
}
