package DataTypesAndVariablesMOREexercises;

import java.math.BigInteger;
import java.util.Scanner;

public class FromLeftToTheRight {
    private static int sumOfDigits(BigInteger number) {
        number = number.abs();

        int sum = 0;
        while (!number.equals(BigInteger.ZERO)) {
            sum += number.mod(BigInteger.TEN).intValue();
            number = number.divide(BigInteger.TEN);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < number; i++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            BigInteger leftNumber = new BigInteger(numbers[0]);
            BigInteger rightNumber = new BigInteger(numbers[1]);

            int sum;
            if (leftNumber.compareTo(rightNumber) > 0) {
                sum = sumOfDigits(leftNumber);
            } else {
                sum = sumOfDigits(rightNumber);
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}


