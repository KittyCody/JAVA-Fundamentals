package Lists_EXERCISES;

import java.util.*;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Wagon> wagons = new ArrayList<>();

        wagons.add(new Wagon(1, 40));
        wagons.add(new Wagon(2, 40));
        wagons.add(new Wagon(3, 40));
        wagons.add(new Wagon(4, 40));
        wagons.add(new Wagon(5, 40));
        wagons.add(new Wagon(6, 40));

        addPassenger(wagons, 88);

        for (Wagon wagon : wagons) {
            System.out.println(wagon.getCurrentPassengers());
        }
    }

    private static void addPassenger(List<Wagon> wagons, int newPassengers) {
        int remainingPassengers = newPassengers;

        for (Wagon wagon : wagons) {
            if (remainingPassengers <= 0) {
                break;
            }
            int availableSpace = wagon.getCapacity() - wagon.getCurrentPassengers();


            if (remainingPassengers <= availableSpace) {
                wagon.addPassengers(remainingPassengers);
                remainingPassengers = 0;
            } else {
                wagon.addPassengers(availableSpace);
                remainingPassengers -= availableSpace;
            }

        }
    }
}