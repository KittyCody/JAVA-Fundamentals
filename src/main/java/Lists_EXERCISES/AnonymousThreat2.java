package Lists_EXERCISES;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AnonymousThreat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.asList(scanner.nextLine().split(" "));
        elements = new ArrayList<>(elements);

        String command = scanner.nextLine().toLowerCase();

        while (!command.equals("3:1")) {
            if (command.startsWith("merge")) {
                mergeElements(elements, command);
            } else if (command.startsWith("divide")) {
                divideElements(elements, command);
            }

            command = scanner.nextLine().toLowerCase();
        }

        System.out.println(String.join(" ", elements));

        scanner.close();
    }

    private static void mergeElements(List<String> elements, String command) {
        String[] parts = command.split(" ");
        int startIndex = Math.max(0, Integer.parseInt(parts[1]));
        int endIndex = Math.min(elements.size() - 1, Integer.parseInt(parts[2]));

        if (startIndex < endIndex) {
            StringBuilder mergedElement = new StringBuilder();
            for (int i = startIndex; i <= endIndex; i++) {
                mergedElement.append(elements.get(i));
            }

            for (int i = startIndex; i <= endIndex; i++) {
                elements.remove(startIndex);
            }
            elements.add(startIndex, mergedElement.toString());
        }
    }

    private static void divideElements(List<String> elements, String command) {
        String[] parts = command.split(" ");
        int index = Integer.parseInt(parts[1]);
        int partitions = Integer.parseInt(parts[2]);

        String elementToDivide = elements.get(index);
        List<String> dividedParts = new ArrayList<>();
        int partSize = elementToDivide.length() / partitions;
        int remainder = elementToDivide.length() % partitions;

        int currentIndex = 0;
        for (int i = 0; i < partitions; i++) {
            if (i == partitions - 1) {
                dividedParts.add(elementToDivide.substring(currentIndex));
            } else {
                int endIndex = currentIndex + partSize + (remainder > 0 ? 1 : 0);
                dividedParts.add(elementToDivide.substring(currentIndex, endIndex));
                currentIndex = endIndex;
                if (remainder > 0) remainder--;
            }
        }

        elements.remove(index);
        elements.addAll(index, dividedParts);
    }
}
