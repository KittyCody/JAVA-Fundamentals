package LAB;
import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scan.nextLine());
        double pricePerSquareMeter = 7.61;
        double totalPrice = squareMeters * pricePerSquareMeter;

        double discount = totalPrice * 0.18;
        totalPrice = totalPrice - discount;

        System.out.printf("The final price is: %f lv.", totalPrice);
        System.out.printf("The discount is: %f lv.", discount);

        scan.close();

    }
}
