package lists_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String[] command = scan.nextLine().split(" ");

            if (command[0].equalsIgnoreCase("End")) {
                break;
            }

            switch (command[0]) {
                case "Add":
                    addNumber(command[1], numbers);
                    break;
                case "Remove":
                    removeNumber(command[1], numbers);
                    break;
                case "Insert":
                    insertNum(command[1], command[2], numbers);
                    break;
                case "Shift":
                    if (command[1].equalsIgnoreCase("left")) {
                        shiftFromLeft(command[2], numbers);
                    } else if (command[1].equalsIgnoreCase("right")) {
                        shiftFromRight(command[2], numbers);
                    }
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

        scan.close();
        for(int number : numbers){
            System.out.print(number + " ");
        }
    }

    private static void shiftFromRight(String number, List<Integer> numbers) {
        int timesToMove = Integer.parseInt(number) % numbers.size();
        if (timesToMove == 0) return;

        for (int i = 0; i < timesToMove; i++) {
            int lastNum = numbers.remove(numbers.size() - 1);
            numbers.add(0, lastNum);
        }
    }

    private static void shiftFromLeft(String number, List<Integer> numbers) {
        int timesToMove = Integer.parseInt(number) % numbers.size();
        if (timesToMove == 0) return;

        for (int i = 0; i < timesToMove; i++) {
            int firstNum = numbers.remove(0);
            numbers.add(firstNum);
        }
    }

    private static void insertNum(String number, String index, List<Integer> numbers) {
        int numToInsert = Integer.parseInt(number);
        int idx = Integer.parseInt(index);

        if (idx >= 0 && idx < numbers.size()) {
            numbers.add(idx, numToInsert);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void removeNumber(String number, List<Integer> numbers) {
        int numToRemove = Integer.parseInt(number);
        if (numToRemove >= 0 && numToRemove < numbers.size()) {
            numbers.remove(numToRemove);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void addNumber(String number, List<Integer> numbers) {
        int numToAdd = Integer.parseInt(number);
        numbers.add(numToAdd);
    }
}

