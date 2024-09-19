package data_types_and_variables_more_exercises;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        for (int i = 2; i <= number; i++) {
            boolean isPrime = true;
            for (int currentNum = 2; currentNum < i; currentNum++) {
                if (i % currentNum == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
            scan.close();
        }
    }
}
