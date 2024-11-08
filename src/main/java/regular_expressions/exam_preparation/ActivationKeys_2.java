package regular_expressions.exam_preparation;

import java.util.Scanner;

public class ActivationKeys_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String command = scanner.nextLine();

        while(!command.equals("Generate")){

            switch (command){
                case "Contains" -> findIfContains(activationKey,command);
                case "Flip" -> flipLetter(activationKey, command);
                case "Slice" -> sliceLetter(activationKey, command);
            }

            command = scanner.nextLine();
        }

        scanner.close();
    }

    private static void flipLetter(String activationKey, String command) {
        StringBuilder key = new StringBuilder(activationKey);

        String [] commandsParts = command.split(">>>");
        String upperOrLower = commandsParts[1];
        int startIndex = Integer.parseInt(commandsParts[2]);
        int endIndex = Integer.parseInt(commandsParts[3]);

        String substring = key.substring(startIndex, endIndex - 1);
        if(upperOrLower.equals("Upper")){
            substring = substring.toUpperCase();
        } else if(upperOrLower.equals("Lower")){
            substring = substring.toLowerCase();
        }

        key.replace(startIndex,endIndex, substring);
        activationKey = key.toString();
        System.out.println(activationKey);
    }

    private static void findIfContains(String activationKey, String command) {

        String [] commandParts = command.split(">>>");
        String substring = commandParts[1];

        if (activationKey.contains(substring)){
            System.out.println(activationKey + " contains " + substring);
        } else {
            System.out.println("Substring not found");
        }
    }
}
