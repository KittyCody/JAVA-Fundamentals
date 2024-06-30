package MoreExercises;
import java.util.Scanner;

public class fishLand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scan.nextLine());
        double spratPrice = Double.parseDouble(scan.nextLine());
        double bonitoKg = Double.parseDouble(scan.nextLine());
        double saffronKg = Double.parseDouble(scan.nextLine());
        double musselsKg = Double.parseDouble(scan.nextLine());

        double bonitoPrice = bonitoKg * (mackerelPrice + mackerelPrice * 0.6);
        double saffronPrice = saffronKg * (spratPrice + spratPrice * 0.8);
        double musselsPrice = musselsKg * 7.50;

        double total = bonitoPrice + saffronPrice + musselsPrice;
        String formatedTotal = String.format("%.2f" , total);

        System.out.println(formatedTotal);

        scan.close();

    }
}
