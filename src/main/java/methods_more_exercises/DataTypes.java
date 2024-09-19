package methods_more_exercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        String input = scan.nextLine();

        switch (command) {
            case "int" -> multiplyInt(input);
            case "real" -> multiplyDouble(input);
            case "string" -> surroundInput(input);
        }

        scan.close();
    }

    private static void surroundInput(String input) {
        String inputSurrounded = "$" + input + "$";
         System.out.print(inputSurrounded);
    }

    private static void multiplyDouble(String input) {
        double inputToDouble = Double.parseDouble(input);
        double result = inputToDouble * 1.5;
        String formatedNum = String.format("%.2f", result);
        System.out.print(formatedNum);
    }

    private static void multiplyInt(String input) {
        int inputToInt = Integer.parseInt(input);
        System.out.print(inputToInt * 2);
    }
}
