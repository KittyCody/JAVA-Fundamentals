package lists_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_Last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer :: parseInt)
                                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine().toLowerCase();

        while(!command.equals("end")) {
            if(command.contains("add")){
                String[] commandParts = command.split(" ");
                int numberToAdd = Integer.parseInt(commandParts[1]);
                wagons.add(numberToAdd);
            } else {
                int numberToAdd = Integer.parseInt(command);
                addPassengersToWagon(numberToAdd, maxCapacity, wagons);
            }

            command = scanner.nextLine();

        }

        for(int wagon : wagons){
            System.out.print(wagon + " ");
        }

        scanner.close();
    }

    private static void addPassengersToWagon(int numberToAdd, int maxCapacity, List<Integer> wagons) {
        for(int i = 0; i < wagons.size(); i++){
            if(wagons.get(i) + numberToAdd <= maxCapacity) {
                wagons.set(i,wagons.get(i) + numberToAdd);
                break;
            }
        }
    }

}

