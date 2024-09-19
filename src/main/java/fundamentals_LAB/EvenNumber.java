package fundamentals_LAB;
import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int number = Integer.parseInt(scan.nextLine());

            if (number % 2 == 0) {
                System.out.printf("The number is: %d%n", Math.abs(number));
                break;
            } else {
                System.out.println("Please write an even number.");
            }
        }

        scan.close();
    }
}

