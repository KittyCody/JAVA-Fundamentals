package lists_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_Last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine().toLowerCase();

        while (!command.equals("end")) {
            String[] commandsParts = command.split(" ");
            String operation = commandsParts[0];

            switch (operation) {
                case "delete" -> {
                    int numberToDelete = Integer.parseInt(commandsParts[1]);
                    deleteNumber(numbers, numberToDelete);
                }
                case "insert" -> insertNumber(numbers, commandsParts);
            }

            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    private static void insertNumber(List<Integer> numbers, String[] commandsParts) {
        int element = Integer.parseInt(commandsParts[1]);
        int position = Integer.parseInt(commandsParts[2]);

        if (position >= 0 && position <= numbers.size()) {
            numbers.add(position, element);
        }
    }

    private static void deleteNumber(List<Integer> numbers, int numberToDelete) {
        // we use removeIf to avoid index-shifting issues
        numbers.removeIf(num -> num == numberToDelete);
    }
}
