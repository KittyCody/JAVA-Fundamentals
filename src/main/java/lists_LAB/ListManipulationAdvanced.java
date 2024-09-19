package lists_LAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(numbers::add);

        String command = scan.nextLine().toLowerCase();

        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");

            if (tokens[0].equals("Contains")) {
                int numberToCheck = Integer.parseInt(tokens[1]);
                doesContain(numbers, numberToCheck);
            } else if (tokens[0].equals("Print")) {
                printFilteredNumbers(numbers, tokens[1]);
            } else if (tokens[0].equals("Get")) {
                printSum(numbers);
            } else if (tokens[0].equals("Filter")) {
                String condition = tokens[1];
                int filterNumber = Integer.parseInt(tokens[2]);
                filterByCondition(numbers, condition, filterNumber);
            }

            command = scan.nextLine();
        }

        scan.close();
    }

    private static void doesContain(List<Integer> numbers, int numberToCheck) {
        if (numbers.contains(numberToCheck)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printFilteredNumbers(List<Integer> numbers, String type) {
        for (int num : numbers) {
            if ((type.equals("even") && num % 2 == 0) ||
                    (type.equals("odd") && num % 2 != 0)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void printSum(List<Integer> numbers) {
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

    private static void filterByCondition(List<Integer> numbers, String condition, int filterNumber) {
        if (condition.equals("<")) {
            numbers.stream()
                    .filter(num -> num < filterNumber)
                    .forEach(num -> System.out.print(num + " "));
        } else if (condition.equals(">")) {
            numbers.stream()
                    .filter(num -> num > filterNumber)
                    .forEach(num -> System.out.print(num + " "));
        } else if (condition.equals("<=")) {
            numbers.stream()
                    .filter(num -> num <= filterNumber)
                    .forEach(num -> System.out.print(num + " "));
        } else if (condition.equals(">=")) {
            numbers.stream()
                    .filter(num -> num >= filterNumber)
                    .forEach(num -> System.out.print(num + " "));
        }
        System.out.println();
    }
}


