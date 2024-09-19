package methods_EXERCISES;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        if(!correctLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!correctTypeCharacters(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if(!correctNumOfDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if(correctLength(password) && correctTypeCharacters(password) && correctNumOfDigits(password)) {
            System.out.println("Password is valid");
        }

        scan.close();
    }

    private static boolean correctNumOfDigits(String password) {
        int digitsCount = 0;
        for(int i = 0; i < password.length(); i++){
            char index = password.charAt(i);

            if(Character.isDigit(index)){
                digitsCount++;
            }
        }
        return digitsCount >= 2;
    }

    private static boolean correctTypeCharacters(String password) {
        for(int i = 0; i < password.length(); i++){
            char index = password.charAt(i);

            if(!Character.isLetterOrDigit(index)) {
                return false;
            }
        }
        return true;
    }

    private static boolean correctLength(String password) {
        int charactersCounter = 0;
        for(int i = 0; i < password.length(); i++){
            charactersCounter++;
        }

        if(charactersCounter < 6 || charactersCounter > 10) {
            return false;
        }
        return true;
    }
}
