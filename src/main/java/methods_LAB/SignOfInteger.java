package methods_LAB;

import java.util.Scanner;

public class    SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        if(number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }

        scan.close();
    }
}
