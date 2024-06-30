package DataTypesAndVariablesEXERCISES;

import java.util.Scanner;

public class SumOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for(int i = 1; i <= numberOfLines; i++){
            String currentChar = scan.nextLine();

            if(currentChar.length() == 1){
                char ch = currentChar.charAt(0);
                int asciiValue = (int) ch;
                sum += asciiValue;
            }
        }
        System.out.printf("The sum equals: %d ", sum);

        scan.close();
    }
}
