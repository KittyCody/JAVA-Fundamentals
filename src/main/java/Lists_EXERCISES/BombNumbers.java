package Lists_EXERCISES;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] bombAndPower = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = calculateSum(numbers, bombAndPower);

        scan.close();

        System.out.println(sum);
    }

    private static int calculateSum(int[] numbers, int[] bombAndPower) {
        int sum = 0;

        int bomb = bombAndPower[0];
        int power = bombAndPower[1];

        for(int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];

            if(currentNum != bomb) {
                continue;
            }
            numbers[i] = 0;

            for(int j = 1; j <= power; j++) {
                if(i + j < numbers.length) {
                    numbers[i + j] = 0;
                }
                if(i - j >= 0) {
                    numbers[i - j] = 0;
                }
            }
        }

        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

