package DataTypesAndVariablesLAB;
import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int meters = Integer.parseInt(scan.nextLine());
        double metersInKm = (double) meters / 1000;

        System.out.printf("%f.2f", metersInKm);


        scan.close();


    }
}