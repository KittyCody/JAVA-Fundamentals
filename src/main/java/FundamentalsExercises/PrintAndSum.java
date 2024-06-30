package FundamentalsExercises;
import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for(int startNum = num1; startNum <= num2; startNum++){
            System.out.print(startNum + " ");
            sum += startNum;

        }

        System.out.printf("%nSum: %d",sum);
        scan.close();
    }
}
