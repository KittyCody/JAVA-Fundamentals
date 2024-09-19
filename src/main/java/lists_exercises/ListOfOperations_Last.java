package lists_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfOperations_Last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                                .collect(Collectors.toList());

        String command = scanner.nextLine().toLowerCase();

        while(!command.equals("end")){

            String[] commandParts = command.split(" ");
            String operation = commandParts[0].toLowerCase();
            switch(operation) {
                case "add" -> addNumberToTheList(commandParts, numbers);
                case "insert" -> insertNumberToTheList(commandParts,numbers);
                case "remove" -> removeNumberFromList(commandParts, numbers);
                case "shift" -> shiftNumberLeftOrRight(commandParts, numbers);
            }

            command = scanner.nextLine().toLowerCase();
        }

        for(int number : numbers){
            System.out.print(number + " ");
        }

        scanner.close();
    }

    private static void shiftNumberLeftOrRight(String[] commandParts, List<Integer> numbers) {
        String direction = commandParts[1].toLowerCase();
        int numOfOperations = Integer.parseInt(commandParts[2]);

        if (direction.equals("left")) {
            for (int i = 0; i < numOfOperations; i++) {
                int firstNumber = numbers.remove(0);
                numbers.add(firstNumber);
            }
        } else {
            for (int i = 0; i < numOfOperations; i++) {
                int secondNumber = numbers.remove(numbers.size() - 1);
                numbers.add(0, secondNumber);
            }

        }
    }
        private static void removeNumberFromList (String[]commandParts, List < Integer > numbers){
            int indexToRemove = Integer.parseInt(commandParts[1]);
            if(indexToRemove <= numbers.size()){
                numbers.remove(indexToRemove);
            } else {
                System.out.println("Invalid index");
            }

    }
    private static void insertNumberToTheList(String[] commandParts, List<Integer> numbers) {
        int numberToInsert = Integer.parseInt(commandParts[1]);
        int position = Integer.parseInt(commandParts[2]);

        if(position >= 0 && position <= numbers.size()){
            numbers.add(position,numberToInsert);
        } else{
            System.out.println("Invalid index");
        }
    }

    private static void addNumberToTheList(String[] commandParts, List<Integer> numbers) {
        int numberToAdd = Integer.parseInt(commandParts[1]);
        numbers.add(numberToAdd);
    }
}
