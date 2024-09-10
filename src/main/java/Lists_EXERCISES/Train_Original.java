package Lists_EXERCISES;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_Original {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine().toLowerCase();
        while (!command.equals("end")) {
            if (command.startsWith("add")) {
                int peopleToAdd = Integer.parseInt(command.split(" ")[1]);
                wagons.add(peopleToAdd);
            } else {
                int passengersToAdd = Integer.parseInt(command);

                for (int position = 0; position < wagons.size(); position++) {
                    int currentPassengers = wagons.get(position);
                    if (currentPassengers + passengersToAdd <= maxCapacity) {
                        wagons.set(position, currentPassengers + passengersToAdd);
                        break;
                    }
                }
            }

            command = scanner.nextLine().toLowerCase();
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
