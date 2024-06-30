package Methods_LAB;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        int result = (int) calculateResult(num1, num2);

        System.out.println(result);
        scan.close();
    }

    private static double calculateResult(int base, int exponent) {
        return Math.pow(base, exponent);
    }
    }


