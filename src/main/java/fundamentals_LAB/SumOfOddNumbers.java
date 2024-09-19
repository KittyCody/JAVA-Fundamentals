package fundamentals_LAB;
import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int count = 0;

        for(int i = 1; count < n; i += 2){
            System.out.println(i);
            sum += i;
            count++;
        }

        System.out.println("Sum: " + sum);

        scan.close();
    }
}

