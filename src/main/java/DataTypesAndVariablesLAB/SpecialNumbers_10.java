package DataTypesAndVariablesLAB;

import java.util.Scanner;
public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= number; i++){
            int sum = 0;
            int currentNum = i;

            while(currentNum > 0){
                int lastDigit =  currentNum % 10;
                sum += lastDigit;
                currentNum /= 10;
            }

            if(sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True", i);
                System.out.println();
            } else {
                System.out.printf("%d -> False", i);
                System.out.println();
            }
        }

        scan.close();
    }
}