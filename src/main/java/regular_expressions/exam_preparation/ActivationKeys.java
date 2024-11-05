package regular_expressions.exam_preparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String activationKey = scanner.nextLine();
    String command = scanner.nextLine();

    StringBuilder result = new StringBuilder(activationKey);

    while(!command.equals("Generate")) {

        String[] commandParts = command.split(">>>");
        String commandType = commandParts[0];

        switch(commandType) {
            case "Contains" -> containsSymbols(result, command);
                case "Flip" -> flipSymbols(result, commandParts);
                    case "Slice" -> sliceSymbols(result, commandParts);
        }
        command = scanner.nextLine();

    }

        scanner.close();
    }

    private static void sliceSymbols(StringBuilder result, String [] commandParts) {

        int startIndex = Integer.parseInt(commandParts[1]);
        int endIndex = Integer.parseInt(commandParts[2]);


        result.delete(startIndex, endIndex);
        System.out.println(result);
    }

    private static void flipSymbols(StringBuilder result, String[] commandParts) {
        String upperOrLower = commandParts[1];
        int startIndex = Integer.parseInt(commandParts[2]);
        int endIndex = Integer.parseInt(commandParts[3]);

    String substring = result.substring(startIndex, endIndex - 1);

    if(upperOrLower.equals("Upper")) {
        substring = substring.toUpperCase();

    } else if(upperOrLower.equals("Lower")) {
        substring = substring.toLowerCase();
    }

    result.replace(startIndex, endIndex, substring);

        System.out.println(result);
    }

    private static void containsSymbols(StringBuilder result, String command) {
        String [] commandParts = command.split(">>>");
       String symbolsToCompare = commandParts[1];
       String activationKey = String.valueOf(result);

       if (activationKey.contains(symbolsToCompare)) {
           System.out.println(activationKey + " contains " + symbolsToCompare);
       } else {
           System.out.println("Substring not found");
       }
    }
}
