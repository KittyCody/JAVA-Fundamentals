package objects_and_classes.songs.vehicle_catalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicule> vehicles = new ArrayList<>();

        // First input loop to add vehicles
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            String[] vehicleData = input.split(" ");
            String type = vehicleData[0];
            String model = vehicleData[1];
            String color = vehicleData[2];
            int horsepower = Integer.parseInt(vehicleData[3]);

            Vehicule vehicle = new Vehicule(type, model, color, horsepower);
            vehicles.add(vehicle);
        }

        // Second input loop to query vehicle models
        while (true) {
            String modelQuery = scanner.nextLine();
            if (modelQuery.equals("Close the Catalogue")) {
                break;
            }

            Vehicule vehicle = vehicles.stream()
                    .filter(v -> v.getModel().equals(modelQuery))
                    .findFirst()
                    .orElse(null);

            if (vehicle != null) {
                System.out.println(vehicle);
            }
        }

        // Calculating and printing average horsepower
        double carAverageHP = calculateAverageHorsepower(vehicles, "car");
        double truckAverageHP = calculateAverageHorsepower(vehicles, "truck");

        System.out.printf("Cars have average horsepower of: %.2f.%n", carAverageHP);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", truckAverageHP);

        scanner.close();
    }

    private static double calculateAverageHorsepower(List<Vehicule> vehicles, String type) {
        int totalHorsepower = vehicles.stream()
                .filter(v -> v.getType().equalsIgnoreCase(type))
                .mapToInt(Vehicule::getHorsepower)
                .sum();

        long count = vehicles.stream()
                .filter(v -> v.getType().equalsIgnoreCase(type))
                .count();

        return count == 0 ? 0 : (double) totalHorsepower / count;
    }
}
