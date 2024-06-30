package Exercises;
import java.util.Scanner;


public class FishTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tankLength = Integer.parseInt(scan.nextLine());
        int tankWidth = Integer.parseInt(scan.nextLine());
        int tankHeight = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        int tankVolume = tankLength * tankWidth * tankHeight;
        double volumeInLitres = (double) tankVolume / 1000;
        double usedSpace = percent / 100;
        double litresNeeded = volumeInLitres * (1 - usedSpace);

        System.out.println(litresNeeded);

        scan.close();
    }
}
