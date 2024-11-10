package regular_expressions.exam_preparation;

import java.util.Scanner;

public class ActivationKeys_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] commandParts = command.split(">>>");
            String operation = commandParts[0];

            switch (operation) {
                case "Contains" -> findIfContains(activationKey, command);
                case "Flip" -> activationKey = flipLetter(activationKey, command);
                case "Slice" -> activationKey = sliceLetter(activationKey, command);
            }

            command = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + activationKey);
        scanner.close();
    }

    private static String sliceLetter(String activationKey, String command) {
        String[] commandParts = command.split(">>>");
        int startIndex = Integer.parseInt(commandParts[1]);
        int endIndex = Integer.parseInt(commandParts[2]);

        String substring = activationKey.substring(startIndex, endIndex);
        activationKey = activationKey.replace(substring, "");

        System.out.println(activationKey);
        return activationKey;
    }

    private static String flipLetter(String activationKey, String command) {
        String[] commandParts = command.split(">>>");
        String upperOrLower = commandParts[1];
        int startIndex = Integer.parseInt(commandParts[2]);
        int endIndex = Integer.parseInt(commandParts[3]);

        String substring = activationKey.substring(startIndex, endIndex);
        if (upperOrLower.equals("Upper")) {
            substring = substring.toUpperCase();
        } else if (upperOrLower.equals("Lower")) {
            substring = substring.toLowerCase();
        }

        activationKey = activationKey.substring(0, startIndex) + substring + activationKey.substring(endIndex);
        System.out.println(activationKey);
        return activationKey;
    }

    private static void findIfContains(String activationKey, String command) {
        String[] commandParts = command.split(">>>");
        String substring = commandParts[1];

        if (activationKey.contains(substring)) {
            System.out.println(activationKey + " contains " + substring);
        } else {
            System.out.println("Substring not found!");
        }
    }
}
