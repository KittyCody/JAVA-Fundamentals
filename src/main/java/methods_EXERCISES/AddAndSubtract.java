package methods_EXERCISES;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int resultSum = sumFirstTwoNumbs(num1, num2);
        int resultSubtract = subtractThirdNum(resultSum,num3);

        scan.close();

        System.out.println(resultSubtract);
    }

    private static int subtractThirdNum(int resultSum, int num3) {
        return resultSum - num3;
    }

    private static int sumFirstTwoNumbs(int num1, int num2) {
        return num1 + num2;
    }

}

