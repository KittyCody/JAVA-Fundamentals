package FundamentalsLAB;
import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int oddNumber = 1;

        for (int i = 0; i < number; i++) {
            System.out.println(oddNumber);
            sum += oddNumber;
            oddNumber += 2;
        }

        System.out.println("Sum: " + sum);
        scan.close();
    }
}
