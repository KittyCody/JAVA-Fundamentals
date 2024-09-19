package lists_exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {
            String inputLine = scan.nextLine();
            if (inputLine.equals("end")) {
                break;
            }

            String[] input = inputLine.split(" ");
            String command = input[0];

            switch (command) {
                case "Delete" -> deleteElement(numbers, input[1]);
                case "Insert" -> insertElement(numbers, input[1], input[2]);
            }
        }

        scan.close();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void insertElement(List<Integer> numbers, String number, String position) {
        int numToInsert = Integer.parseInt(number);
        int pos = Integer.parseInt(position);
        numbers.add(pos, numToInsert);
    }

    private static void deleteElement(List<Integer> numbers, String element) {
        int numToDelete = Integer.parseInt(element);
        numbers.removeIf(n -> n == numToDelete);
    }
}



