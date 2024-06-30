package DataTypesAndVariablesEXERCISES;

import java.util.Scanner;

public class BeerKegs {

        public static double calculateVolume(double radius, int height) {
        final double PI = Math.PI;
        return PI * Math.pow(radius, 2) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String biggestKegModel = "";
        double biggestKegVolume = 0;

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = scanner.nextDouble();
            int height = scanner.nextInt();
            scanner.nextLine();

            double volume = calculateVolume(radius, height);

            if (volume > biggestKegVolume) {
                biggestKegVolume = volume;
                biggestKegModel = model;
            }
        }

        System.out.println(biggestKegModel);
    }
}

