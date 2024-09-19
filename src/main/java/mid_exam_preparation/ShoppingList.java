package mid_exam_preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> items = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Urgent":
                    if (!items.contains(item)) {
                        items.add(0, item);
                    }
                    break;

                case "Unnecessary":
                    items.remove(item);
                    break;

                case "Correct":
                    String newItem = tokens[2];
                    if (items.contains(item)) {
                        int itemIndex = items.indexOf(item);
                        items.set(itemIndex, newItem);
                    }
                    break;

                case "Rearrange":
                    if (items.contains(item)) {
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }

            input = scan.nextLine();
        }

        System.out.println(String.join(", ", items));
    }
}
