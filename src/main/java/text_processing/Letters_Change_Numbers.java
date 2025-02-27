package text_processing;

import java.util.Scanner;

public class Letters_Change_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] codes = scanner.nextLine().split("\\s+");

        double sum = 0;

        for(String code : codes) {
            double result = calculateCodeResult(code);

            sum += result;
        }

        System.out.printf("%.2f", sum);
        scanner.close();
    }

    private static double calculateCodeResult(String code) {

        char letterBefore = code.charAt(0);
        double number = Double.parseDouble(code.substring(1,code.length() - 1));
        char letterAfter = code.charAt(code.length() - 1);

        if(Character.isUpperCase(letterBefore)) {
            number /= letterBefore - 64;
        } else {
            number *= letterBefore - 96;
        }

        if(Character.isUpperCase(letterAfter)) {
            number -= letterAfter - 64;
        } else {
            number += letterAfter - 96;
        }

        return number;
    }
}
