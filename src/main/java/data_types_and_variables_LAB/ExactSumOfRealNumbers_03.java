package data_types_and_variables_LAB;
import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigDecimal sum = BigDecimal.ZERO;

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            String[] numbers = line.split("\\s+");

            for (String numStr : numbers) {
                BigDecimal number = new BigDecimal(numStr);
                sum = sum.add(number);
            }
        }

        System.out.println(sum.toPlainString());

        scan.close();
    }
}



