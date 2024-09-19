package arrays_exercises;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] elements = scan.nextLine().split(" ");
        int[] numbers = new int[elements.length];

        for(int i = 0; i < elements.length; i++){
            numbers[i] = Integer.parseInt(elements[i]);
        }

        int leftSum = 0;
        int rightSum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            rightSum = 0;
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }

            if (leftSum == rightSum) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("no");
        } else {
            System.out.println(count);
        }
    }
}


