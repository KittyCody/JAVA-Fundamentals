package Methods_LAB;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNumber = Integer.parseInt(scan.nextLine());

        switch(operator){
            case "/" ->
                divideNumbs(firstNumber, secondNumber);

            case "*" ->
                multiplyNumbs(firstNumber, secondNumber);

            case "+" ->
                addNumbs(firstNumber, secondNumber);

            case "-" ->
                subtractNumbs(firstNumber,secondNumber);

        }

        scan.close();
    }

    private static void subtractNumbs(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println(result);
    }

    private static void addNumbs(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }

    private static void multiplyNumbs(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println(result);
    }

    private static void divideNumbs(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        System.out.println(result);
    }
}
