package text_processing;

import java.math.BigInteger;
import java.util.Scanner;

public class Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();

        BigInteger number1 = new BigInteger(firstNumber);
        BigInteger number2 = new BigInteger(secondNumber);

        System.out.println(number1.multiply(number2));


        scanner.close();
    }
}
