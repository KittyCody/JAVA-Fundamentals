package Mid_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> elements = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        int moves = 0;

        String input = scan.nextLine();

        while (!input.equals("end")) {
            String[] indices = input.split(" ");
            int firstIndex = Integer.parseInt(indices[0]);
            int secondIndex = Integer.parseInt(indices[1]);
            moves++;

            boolean isValid = isValidIndex(firstIndex, secondIndex, elements.size());

            if (!isValid) {
                String newElement = String.format("-%da", moves);
                elements.add(elements.size() / 2, newElement);
                elements.add(elements.size() / 2, newElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);

                if (firstElement.equals(secondElement)) {
                    System.out.printf("Congrats! You have found matching elements - %s!\n", firstElement);
                    elements.remove(Math.max(firstIndex, secondIndex));
                    elements.remove(Math.min(firstIndex, secondIndex));
                } else {
                    System.out.println("Try again!");
                }
            }

            input = scan.nextLine();
        }


        if (elements.isEmpty()) {
            System.out.printf("You have won in %d turns!\n", moves);
        }

        System.out.println("Sorry, you lose :(");
        System.out.println(String.join(" ", elements));



        scan.close();
    }

    private static boolean isValidIndex(int firstIndex, int secondIndex, int size) {
        boolean areNotTheSameIndexes = firstIndex != secondIndex;
        boolean firstIndexBounds = firstIndex >= 0 && firstIndex < size;
        boolean secondIndexBounds = secondIndex >= 0 && secondIndex < size;

        return areNotTheSameIndexes && firstIndexBounds && secondIndexBounds;
    }
}
