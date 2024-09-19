package lists_more_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Messaging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        String message = scan.nextLine().trim();

        String decryptedMessage = decryptMessage(numbers, message);

        scan.close();

        System.out.print(decryptedMessage);
    }

    private static String decryptMessage(int[] numbers, String message) {
        StringBuilder decryptedMessage = new StringBuilder();
        int messageLength = message.length();

        for (int number : numbers) {
            int sumOfDigits = sumOfDigitsIndex(number);

            int index = sumOfDigits % messageLength;
            if (index < 0) {
                index += messageLength;
            }

            decryptedMessage.append(message.charAt(index));

            message = removeCharAtIndex(message, index);
            messageLength--;
        }
        return decryptedMessage.toString();
    }

    private static String removeCharAtIndex(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }

    private static int sumOfDigitsIndex(int number) {
        int sum = 0;

        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
