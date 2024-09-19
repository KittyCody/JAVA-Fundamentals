package methods_more_exercises;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        scan.close();

        String result = getProductSign(num1, num2, num3);
        System.out.println(result);
    }

    private static String getProductSign(int num1, int num2, int num3) {

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            return "zero";
        }

        int negativesCount = 0;
        if (num1 < 0) {
            negativesCount++;
        }
        if (num2 < 0) {
            negativesCount++;
        }
        if (num3 < 0) {
            negativesCount++;
        }

        if (negativesCount % 2 == 0) {
            return "positive";
        } else {
            return "negative";
        }
    }
}

