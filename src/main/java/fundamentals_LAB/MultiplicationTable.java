package fundamentals_LAB;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.printf("%d X %d = %d%n", number, i, result);
        }

        scan.close();
    }
}

