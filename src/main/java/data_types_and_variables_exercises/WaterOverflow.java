package data_types_and_variables_exercises;
import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());
        int totalCapacity = 255;
        int usedCapacity = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int currentLiters = Integer.parseInt(scan.nextLine());
            if (usedCapacity + currentLiters <= totalCapacity) {
                usedCapacity += currentLiters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(usedCapacity);

        scan.close();
    }
}

