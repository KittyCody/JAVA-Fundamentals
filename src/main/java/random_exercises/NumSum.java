package random_exercises;

import java.util.Scanner;

public class NumSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int input = Math.abs(scanner.nextInt());
       int result = 0;

       while (input != 0) {
           int num = input % 10;
           result += num;
           input /= 10;
       }

       System.out.println(result);

        scanner.close();
    }

}

//i can't convert to chars
//have to only use mathematical operations