package arrays_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int persons = Integer.parseInt(scan.nextLine());

        int[] wagons = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < wagons.length; i++) {
            while (wagons[i] < 4 && persons > 0) {
                wagons[i]++;
                persons--;
            }
        }

        if (persons == 0 && Arrays.stream(wagons).anyMatch(w -> w < 4)) {
            System.out.println("The lift has empty spots!");
        } else if (persons > 0 && Arrays.stream(wagons).allMatch(w -> w == 4)) {
            System.out.println("There isn't enough space! " + persons + " people in a queue!");
        }

        for (int i = 0; i < wagons.length; i++) {
            System.out.print(wagons[i]);
            if (i < wagons.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
