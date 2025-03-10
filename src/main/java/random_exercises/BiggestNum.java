package random_exercises;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                       .mapToInt(Integer::parseInt)
                               .toArray();

       int biggestNum = numbers[0];

       for(int i = 1; i < numbers.length; i++) {
           int currentNum = numbers[i];
           if(currentNum > biggestNum) {
               biggestNum = currentNum;
           }
       }

       System.out.println(biggestNum);

       scanner.close();
    }
}
