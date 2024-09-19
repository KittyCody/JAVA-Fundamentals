package methods_LAB;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int result = calculateEvenByOdds(number);

        System.out.println(result);
        scan.close();
    }

    private static int calculateEvenByOdds(int number) {

        String numToString = String.valueOf(Math.abs(number));
        int sumOfOdds = 0;
        int sumOfEvens = 0;

        for(int i = 0; i < numToString.length(); i++){
            int currentIndex = Character.getNumericValue(numToString.charAt(i));

            if(currentIndex % 2 == 0){
                sumOfEvens += currentIndex;
            } else{
                sumOfOdds += currentIndex;
            }
        }
        return sumOfOdds * sumOfEvens;
    }
}

