package LIsts_MORE_EXERCISES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double savings = scan.nextDouble();
        scan.nextLine();

        List<Integer> drumSet = new ArrayList<>();
        List<Integer> initialQuality = new ArrayList<>();

        Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(drum -> {
                    drumSet.add(drum);
                    initialQuality.add(drum);
                });

        String command = scan.nextLine();

        while (!command.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(command);

            for (int i = 0; i < drumSet.size(); i++) {
                drumSet.set(i, drumSet.get(i) - power);

                if (drumSet.get(i) <= 0) {
                    double price = initialQuality.get(i) * 3;
                    if (savings >= price) {
                        savings -= price;
                        drumSet.set(i, initialQuality.get(i));
                    } else {
                        drumSet.remove(i);
                        initialQuality.remove(i);
                        i--;
                    }
                }
            }

            command = scan.nextLine();
        }

        for (int i = 0; i < drumSet.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(drumSet.get(i));
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.%n", savings);
    }
}
