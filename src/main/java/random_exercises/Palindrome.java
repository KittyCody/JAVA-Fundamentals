package random_exercises;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if(isPalindrome(input)) {
            System.out.println("the number is palindrome");
        } else {
            System.out.println("the number is not palindrome");
        }

        scanner.close();
    }
    private static boolean isPalindrome(int input) {

        String numberToString = String.valueOf(input);
        StringBuilder reversedNumber = new StringBuilder(numberToString);
        reversedNumber.reverse();

        return reversedNumber.toString().equals(numberToString);
    }

}
