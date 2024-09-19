package fundamentals_more_exercises;
import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);

        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.printf("%d%n", numbers[i]);
        }

        scan.close();
    }

}


