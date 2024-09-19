package data_types_and_variables_more_exercises;

import java.util.Scanner;

public class DataTypeFinder {

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isFloatingPoint(String input) {
        try {
            Double.parseDouble((input));
            return true;
        } catch(NumberFormatException e){
            return false;
            }
    } private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    private static boolean isCharacter(String input) {
        return input.length() == 1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input;

        while(true){
            input = scan.nextLine();

            if(input.equals("END")){
                break;
            }

            if(isInteger(input)){
                System.out.println(input + " is integer type");
            } else if(isFloatingPoint(input)){
                System.out.println(input + " is floating point type");
            } else if(isBoolean((input))){
                System.out.println(input + " is boolean type");
            } else if(isCharacter(input)){
                System.out.println(input + " is character type");
            } else {
                System.out.println(input + " is a string type");
            }
        }

    }


}

