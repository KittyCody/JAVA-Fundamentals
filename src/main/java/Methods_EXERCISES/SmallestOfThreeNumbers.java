package Methods_EXERCISES;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        int smallestNum = calculateSmallestNum(firstNumber, secondNumber,thirdNumber);

        System.out.println(smallestNum);
        scan.close();
    }

    private static int calculateSmallestNum(int firstNumber, int secondNumber, int thirdNumber) {
        if(firstNumber < secondNumber && firstNumber < thirdNumber){
            return firstNumber;
        } else if(secondNumber < firstNumber && secondNumber < thirdNumber){
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
