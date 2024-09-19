package fundamentals_LAB;
import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        if(num2 > 10){
            int result = num1 * num2;
            System.out.printf("%d X %d = %d", num1, num2, result);
        } else{
            for(int currentNum = num2; currentNum <= 10; currentNum ++){
                int result = num1 * currentNum;
                System.out.printf("%d X %d = %d%n", num1, currentNum, result);
            }
        }
        scan.close();
    }

}

