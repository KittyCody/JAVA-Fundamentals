package random_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Pairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(scanner.nextInt());

        ArrayList<Integer> unpairs = new ArrayList<>();
        int result = 1;

        while (input != 0) {
            int num = input % 10;
            if(num % 2 != 0) {
                unpairs.add(num);
            }
            input /= 10;
        }

        if(unpairs.isEmpty()) {
            System.out.println(1);
            return;
        }
        for(int num : unpairs) {
            result *= num;
        }

        System.out.println(result);

        scanner.close();

    }

}
