package arrays_LAB;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int sumOfEvenNumbs = 0;
        int sumOfOddNumbs = 0;

        for(String item : input){
            int currentNum = Integer.parseInt(item);
            if(currentNum % 2 == 0){
                sumOfEvenNumbs += currentNum;
            } else{
                sumOfOddNumbs += currentNum;
            }
        }
        int result = sumOfEvenNumbs - sumOfOddNumbs;
        System.out.print(result);

        scan.close();

    }
}


