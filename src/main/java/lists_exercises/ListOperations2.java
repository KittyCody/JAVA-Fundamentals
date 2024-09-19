package lists_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine().toLowerCase();

        while (!command.equals("end")) {
            if (command.startsWith("add")) {
                addNumberAtTheEnd(numbers, command);
            } else if (command.startsWith("insert")) {
                insertNumberAtPosition(numbers, command);
            } else if (command.startsWith("remove")) {
                removeByIndex(numbers, command);
            } else if (command.startsWith("shift left")) {
                shiftLeftNum(numbers, command);
            } else if (command.startsWith("shift right")) {
                shiftRightNum(numbers, command);
            }

            command = scanner.nextLine().toLowerCase();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static void shiftRightNum(List<Integer> numbers, String command) {
        int numOfTimes = Integer.parseInt(command.split(" ")[2]);
        for (int i = 0; i < numOfTimes; i++) {
            int lastNum = numbers.remove(numbers.size() - 1);
            numbers.add(0, lastNum);
        }
    }

    private static void shiftLeftNum(List<Integer> numbers, String command) {
        int numOfTimes = Integer.parseInt(command.split(" ")[2]);
        for (int i = 0; i < numOfTimes; i++) {
            int firstNum = numbers.remove(0);
            numbers.add(firstNum);
        }
    }

    private static void removeByIndex(List<Integer> numbers, String command) {
        int index = Integer.parseInt(command.split(" ")[1]);
        if (index >= 0 && index < numbers.size()) {
            numbers.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void insertNumberAtPosition(List<Integer> numbers, String command) {
        int number = Integer.parseInt(command.split(" ")[1]);
        int position = Integer.parseInt(command.split(" ")[2]);

        if (position >= 0 && position <= numbers.size()) {
            numbers.add(position, number);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void addNumberAtTheEnd(List<Integer> numbers, String command) {
        int numberToAdd = Integer.parseInt(command.split(" ")[1]);
        numbers.add(numberToAdd);
    }
}
